package ex3.view;

import ex3.controller.Controller;
import ex3.util.Input;

public class AccountView implements View{
    @Override
    public void render() {
        accountMenu();
        Controller.AccountController(Input.input());
    }

    public void accountMenu() {
        System.out.println("======<< Account >>======");
        System.out.println("1. 계좌생성");
        System.out.println("b. 뒤로가기");
        System.out.println("==========================");
        System.out.print("입력 : ");
    }
}
