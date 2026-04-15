package ex2.view;

import ex2.controller.*;
import ex2.dto.*;
import ex2.entity.*;
import ex2.router.*;
import ex2.util.*;
import ex2.view.component.Table;

import javax.swing.*;
import java.lang.reflect.Field;
import java.time.chrono.HijrahEra;
import java.util.*;

public class AccountView implements View{
    private Account currentAccount;

    @Override
    public void render() {
        if (currentAccount == null) {
            ResponseDto<?> accountListResponse = Controller.getAccountListController();//2번메뉴로 들어왔을때 //list조회
            if (accountListResponse.getStatus() == 400) {
                notFoundAccount(accountListResponse.getDate().toString());//400일때 에러
                RouterPath.current = Routes.HOME.name();
                return;
            }
            selectAccount((List<Account>) accountListResponse.getDate());
            System.out.println("=====<< 계좌 ID 선택 >>=====");
            int selectedId = Integer.parseInt(Input.nextLine());//예외처리 필수
            ResponseDto<?> ressponse = Controller.selectAccountController(selectedId);
            if (ressponse.getStatus() == 400) {
                notFoundAccount(ressponse.getDate().toString());
                return;
            }
            currentAccount = (Account) ressponse.getDate();
        }//안그럼 메뉴계속 보여주는

        accountMenu();
        String emd = Input.nextLine();
        ResponseDto<?> menuResponse = Controller.accountMenuController(emd);
        if(menuResponse.getStatus() == 100) {
            RouterPath.current = Routes.HOME.name();
            currentAccount= null;
            return;
        }

    }

    public void accountError(String message) {
        HashMap<String, String> props = new HashMap<>();
        props.put("title", "문제발견");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("오류 메세지 : ");
        stringBuilder.append(message);
        stringBuilder.append("\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
        Input.nextWait();
    }
    private void notFoundAccount(String message) {
        System.out.println("======<< 계좌조회 실패 >>======");
        System.out.println(message);
        System.out.println("=============================");

    }
    private void selectAccount(List<Account> accountList) {
        HashMap<String, String> props = new HashMap<>();
        props.put("title","계좌목록");
        StringBuilder stringBuilder = new StringBuilder();


        List<List<Object>> rows = accountList.stream().map(row -> {
            List<Object> fileds = new ArrayList<>();

            Field[] filedsArray = row.getClass().getDeclaredFields();
            for (Field f : filedsArray) {
                try {
                    f.setAccessible(true);// priavte인 변수들을 private를 강제로 풀어버린다
                    fileds.add(f.get(row));//filed의
                }catch (IllegalAccessException e){}
            }
            return fileds;
        }).toList();

        props.put("body", new Table(List.of("ID", "AccountNo", "Owner"), rows).getTable());
        basicLayout(props);


        System.out.println("| ID |         계좌번호        | 예금주");

    }

    private void accountMenu() {
        HashMap<String, String> props = new HashMap<>();
        props.put("title", String.format("선택계좌 : %s", currentAccount.getAccountNo()));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1. 거래내역\n");
        stringBuilder.append("2. 입금\n");
        stringBuilder.append("3. 출금\n");
        stringBuilder.append("b. 뒤로가기\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
    }
}
