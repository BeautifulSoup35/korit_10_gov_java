package ex2.view;

import ex2.Ex2Aplication;
import ex2.controller.Controller;
import ex2.dto.ResponseDto;
import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;

import java.util.Map;

public class CreateAccountView implements View{
    public void render() {
        ResponseDto<?> accountListResponse = Controller.getAccountListController();

        accountMenu();
        String cmd = Input.nextLine();
        ResponseDto<?> response = Controller.createAccount();
        if (response.getStatus() == 100){
            RouterPath.current = Routes.ACCOUNT.name();
        }
    }

    private void accountMenu() {
        System.out.println("======<< CREATE_ACCOUNT >>======");
        System.out.println("1. 계좌생성하기");

        System.out.println("b. 뒤로가기");

        System.out.println("================================");
    }

}
