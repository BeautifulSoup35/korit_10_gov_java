package ex2.view;

import ex2.controller.Controller;
import ex2.dto.ResponseDto;
import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;

public class AccountView implements View{
    @Override
    public void render() {
        ResponseDto<?> accountListResponse = Controller.getAccountListController();
        if (accountListResponse.getStatus() == 400) {
            notFoundAccount(accountListResponse.getDate().toString());
            RouterPath.current = Routes.HOME.name();
            return;
        }
        accountMenu();
        String cmd = Input.nextLine();
        ResponseDto<?> response = Controller.accountController(cmd);
        if (response.getStatus() == 100){
            RouterPath.current = Routes.ACCOUNT.name();
        }
    }
    private void notFoundAccount(String message) {
        System.out.println("======<< 계좌조회 실패 >>======");
        System.out.println(message);
        System.out.println("=============================");

    }
    private void selectAccount() {
        System.out.println("======<< 계좌목록 >>======");

        System.out.println("=========================");
    }

    private void accountMenu() {
        System.out.println("======<< Account >>======");
        System.out.println("1. 계좌선택");
        System.out.println("1. 계좌생성");
        System.out.println("1. 계좌생성");
        System.out.println("1. 계좌생성");
        System.out.println("1. 계좌생성");
        System.out.println("1. 계좌생성");
        System.out.println("b. 뒤로가기");

        System.out.println("==========================");
    }
}
