package ex3.view;

import ex3.controller.Controller;
import ex3.util.Input;

public class AccountInfoView implements View{
    @Override
    public void render() {
        nameBalance();
        Controller.nameController(Input.input());

    }

    public void nameBalance() {
        System.out.print("이름 / 초기입금액 입력하시요: ");
    }

}
