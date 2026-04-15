package ex2.view;

import ex2.*;
import ex2.controller.*;
import ex2.dto.*;
import ex2.util.*;

import java.util.HashMap;
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
            Input.nextWait();
            return;
        }


    }
    public void homeMenu() {
        HashMap<String, String> props = new HashMap<>();
        props.put("title", "홈 메뉴");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1. 계좌 생성\n");
        stringBuilder.append("2. 은행 서비스 이용하기\n");
        stringBuilder.append("q. 종료\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);

    }


    public void homeError(String message) {
        HashMap<String, String> props = new HashMap<>();
        props.put("title", "문제발견");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("오류 메세지 : ");
        stringBuilder.append(message);
        stringBuilder.append("\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
        Input.nextWait();

    }


}
