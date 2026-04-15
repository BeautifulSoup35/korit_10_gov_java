package ex2.view;

import ex2.Ex2Aplication;
import ex2.controller.Controller;
import ex2.dto.ResponseDto;
import ex2.util.Input;

import java.util.Map;
public class HomeView implements View {
    private static HomeView instance;

    public void render() {
        homeMenu();
        String cmd = Input.nextLine();
        ResponseDto<Map<String, Object>> response= Controller.homeController(cmd);

        if (response.getStatus() == 100){
            Ex2Aplication.running = false;
            return;
        }
        if (response.getStatus() != 200){
            homeError(response.getDate().get("message").toString());
            return;
        }


    }
    public void homeMenu() {
        System.out.println("======<< HOME >>======");
        System.out.println("1. 계좌생성");
        System.out.println("2. 계좌조회");
        System.out.println("q. 종료");
        System.out.println("======================");



    }


    public void homeError(String message) {
        System.out.println("======<< HOME ERROR >>======");
        System.out.println("오류내용 : " + message);
        System.out.println("============================");
        System.out.println();

    }


}
