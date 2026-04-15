package ex2.view;

import ex2.controller.Controller;
import ex2.dto.ResponseDto;
import ex2.entity.Account;
import ex2.router.RouterPath;
import ex2.router.Routes;

import java.nio.channels.SelectionKey;
import java.util.List;

public class AccountView implements View{
    @Override
    public void render() {
        ResponseDto<?> accountListResponse = Controller.getAccountListController();//2번메뉴로 들어왔을때 //list조회
        if (accountListResponse.getStatus() == 400) {
            notFoundAccount(accountListResponse.getDate().toString());//400일때 에러
            RouterPath.current = Routes.HOME.name();
            return;
        }
        selectAccount((List<Account>) accountListResponse.getDate());
    }
    private void notFoundAccount(String message) {
        System.out.println("======<< 계좌조회 실패 >>======");
        System.out.println(message);
        System.out.println("=============================");

    }
    private void selectAccount(List<Account> accountList) {
        System.out.println("======<< 계좌목록 >>======");
        System.out.println("| ID | 계좌번호 | 예금주");
        accountList.forEach(account -> System.out.println(""));
        System.out.println("=========================");
    }

    private void accountMenu() {
        System.out.println("======<< Account >>======");
        System.out.println("1. 거래내역");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("b. 뒤로가기");

        System.out.println("==========================");
    }
}
