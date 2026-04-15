package exectly.view;

import exectly.Ex2Application;
import exectly.controller.Controller;
import exectly.dto.ResponseDto;
import exectly.entity.Account;
import exectly.router.RouterPath;
import exectly.router.Routes;
import exectly.util.Input;
import exectly.view.component.Table;

import java.lang.reflect.Field;
import java.util.*;

public class AccountView implements View {
    private Account currentAccount;

    @Override
    public void render() {//home에서 2번을 눌렀을때 시작
        if (currentAccount == null) {//처음에는 null로 if문에 들어옴
            ResponseDto<?> accountListResponse = Controller.getAccountListController();
            if (accountListResponse.getStatus() == 400) {
                accountError(accountListResponse.getData().toString());
                RouterPath.current = Routes.HOME.name();
                return;
            }
            selectAccount((List<Account>) accountListResponse.getData());
            System.out.println("======<< 계좌 ID선택 >>======");
            int selectedId = Integer.parseInt(Input.nextLine());
            ResponseDto<?> response = Controller.selectAccountController(selectedId);
            if (response.getStatus() == 400) {
                accountError(response.getData().toString());
                return;
            }
            currentAccount = (Account) response.getData();
        }
        accountMenu();
        String cmd = Input.nextLine();
        ResponseDto<?> menuResponse = Controller.accountMenuController(cmd);
        if (menuResponse.getStatus() == 100) {
            currentAccount = null;
            RouterPath.current = Routes.HOME.name();
            return;
        }
        if (menuResponse.getStatus() == 400) {
            accountError(menuResponse.getData().toString());
        }
    }

    private void accountError(String message) {
        Map<String, String> props = new HashMap<>();
        props.put("title", "문제 발견");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("오류 메세지: ");
        stringBuilder.append(message);
        stringBuilder.append("\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
        Input.nextWait();
    }

    private void selectAccount(List<Account> accountList) {
        Map<String, String> props = new HashMap<>();
        props.put("title", "계좌 목록");

        List<List<Object>> rows = accountList.stream().map(row -> {
            List<Object> fileds = new ArrayList<>();
            Field[] fieldArray = row.getClass().getDeclaredFields();

            for (Field f : fieldArray) {
                try {
                    f.setAccessible(true);
                    fileds.add(f.get(row));
                } catch (IllegalAccessException e) {}
            }
            return fileds;
        }).toList();
        System.out.println(rows);
        props.put("body", new Table(List.of("ID", "AccountNo", "Owner", "Balance"), rows).getTable());
        basicLayout(props);
    }

    private void accountMenu() {
        Map<String, String> props = new HashMap<>();
        props.put("title", String.format("선택계좌: %s", currentAccount.getAccountNo()));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1. 거래내역조회\n");
        stringBuilder.append("2. 입금\n");
        stringBuilder.append("3. 출금\n");
        stringBuilder.append("b. 뒤로가기\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
    }

}














