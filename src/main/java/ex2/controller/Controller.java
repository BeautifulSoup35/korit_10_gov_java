package ex2.controller;


import ex2.dto.ResponseDto;

import java.util.*;

public class Controller {
    public static ResponseDto<Map<String, Object>> homeController(String selectedMenu) {
        ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
        try {
            if ("1".equals(selectedMenu)) {
                throw new RuntimeException("계좌등록 실패 유효한 계좌번호를 입력하세요");
            }else if ("2".equals(selectedMenu)) {

            }else if ("3".equals(selectedMenu)) {

            }else if ("4".equals(selectedMenu)) {

            }else if ("5".equals(selectedMenu)) {

            }else if ("6".equals(selectedMenu)) {

            }else if ("q".equals(selectedMenu)) {
                responseDto.setStatus(100);
            }else {
                throw new RuntimeException("해당값을 유효하지 않습니다.");
            }
        } catch (RuntimeException e) {
            Map<String, Object> errorMap = Map.of(
                    "message", e.getMessage()

            );
            responseDto = new ResponseDto<>(400, errorMap);//상태, 데이터값
        }

        return responseDto;
    }

}


