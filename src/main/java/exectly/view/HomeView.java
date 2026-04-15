package exectly.view;

import exectly.Ex2Application;
import exectly.controller.Controller;
import exectly.dto.ResponseDto;
import exectly.util.Input;

import java.util.HashMap;
import java.util.Map;

public class HomeView implements View {

    @Override
    public void render() {
        homeMenu();
        String cmd = Input.nextLine();//사용자가 선택 가져오기
        ResponseDto<Map<String, Object>> response = Controller.homeController(cmd);
        //ResponseDto는 제너럴 값을 가져와 int인 stauts와 제너럴 값인 data로 받는다.
        //ResposeDto -- 상태와 데이터 값으로 이루어져있다
        //정상일 경우 200,() 종료일경루 100,() 오류일경우 400, (message, 에러.getmessage)의 값이 response에 들어간다.

        if (response.getStatus() == 100) {
            Ex2Application.running = false;
            return;//main에서 static으로 만든 running을 false로 바꿔서 while문 멈추기
        }
        if (response.getStatus() != 200) {
            homeError(response.getData().get("message").toString());
            return;
            //200이 아니라면 repose객체에서 map인 data를 get해와 message라는 키값을 같는 valuse를 가져와 string으로 반환한다
        }
    }

    private void homeMenu() {
        Map<String, String> props = new HashMap<>();
        props.put("title", "홈 메뉴");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1. 계좌 생성\n");
        stringBuilder.append("2. 은행 서비스 이용하기\n");
        stringBuilder.append("q. 프로그램 종료\n");
        props.put("body", stringBuilder.toString()); //탑 미들(전체 string형태로 반환 중간에 \n 필수) 바텀
        basicLayout(props);//서비스 메뉴
    }

    private void homeError(String message) {//오류 메세지를 받아 props에 넣어 형식에 맞춰 print
        Map<String, String> props = new HashMap<>();
        props.put("title", "문제 발견");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("오류 메세지: ");
        stringBuilder.append(message);
        stringBuilder.append("\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
        Input.nextWait();//오류가 나도 계속 하려면 누름 그리고 while문을 건들지 않음
    }


}
