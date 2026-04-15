package ex2.view;

import ex2.controller.*;
import ex2.dto.*;
import ex2.router.*;
import ex2.util.*;

import java.util.*;

public class CreateAccountView implements View{
    public void render() {
        ResponseDto<?> accountListResponse = Controller.getAccountListController();

        accountMenu();
        String cmd = Input.nextLine();
        ResponseDto<?> response = Controller.createaccountController(cmd);
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
