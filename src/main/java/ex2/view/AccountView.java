package ex2.view;

import ex2.controller.Controller;
import ex2.dto.ResponseDto;
import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;

public class AccountView implements View{
    @Override
    public void render() {
        accountMenu();
         String cmd = Input.nextLine();
        ResponseDto<?> response = Controller.accountController(cmd);
        if (response.getStatus() == 100){
            RouterPath.current = Routes.ACCOUNT.name();
        }
    }
    private void accountMenu() {
        System.out.println("======<< Account >>======");
        System.out.println("1. 계좌생성");
        System.out.println("b. 뒤로가기");

        System.out.println("==========================");
    }
}
