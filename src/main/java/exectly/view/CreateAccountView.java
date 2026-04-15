package exectly.view;

import exectly.controller.Controller;
import exectly.dto.ResponseDto;
import exectly.router.RouterPath;
import exectly.router.Routes;
import exectly.util.Input;

public class CreateAccountView implements View { //홈에서 1번을 타고 오면 이 화면으로 전환

    @Override
    public void render() {
        createAccountMenu();
        String cmd = Input.nextLine();
        ResponseDto<?> response = Controller.createAccountController(cmd);//status가 100인지 200인지만 변하고 data는 null상태로 들어옴
        if (response.getStatus() == 100) {
            RouterPath.current = Routes.HOME.name();//b일때 home으로 가기
        }
    }

    private void createAccountMenu() {
        System.out.println("======<< CREATE_ACCOUNT >>======");
        System.out.println("1. 계좌생성하기");
        System.out.println("b. 뒤로가기");
        System.out.println("======================");
        System.out.println();
    }

}














