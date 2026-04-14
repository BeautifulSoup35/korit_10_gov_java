package ex2.controller;


import ex2.Repository.AccountRepository;
import ex2.Repository.AccountRepositoryImpl;
import ex2.dto.ResponseDto;
import ex2.entity.Account;
import ex2.util.Input;

import java.util.*;

public class Controller {
    public static ResponseDto<Map<String, Object>> homeController(String selectedMenu) {
        ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
        try {
            if ("1".equals(selectedMenu)) {
                throw new RuntimeException("계좌등록 실패 유효한 계좌번호를 입력하세요");
            } else if ("2".equals(selectedMenu)) {

            } else if ("3".equals(selectedMenu)) {

            } else if ("4".equals(selectedMenu)) {

            } else if ("5".equals(selectedMenu)) {

            } else if ("6".equals(selectedMenu)) {

            } else if ("q".equals(selectedMenu)) {
                responseDto.setStatus(100);
            } else {
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


    public static ResponseDto<?> accountController(String selectedMnue) {
        ResponseDto<?> responseDto = new ResponseDto<>(200, null);
        if ("1".equals(selectedMnue)) {
            //계좌 생성
            System.out.println("계좌 생성 각 항목");
            System.out.println("계좌번호: ");
            String accountno = Input.nextLine();
            System.out.println("예금주: ");
            String owner = Input.nextLine();
            System.out.println("잔액: ");
            int balance = Integer.parseInt(Input.nextLine());
            Account newAccount = new Account(0, accountno, owner, balance);
            Account savedAccount = AccountRepositoryImpl.ACCOUNT_REPOSITORY.save(newAccount);
            System.out.println(savedAccount);


        } else if ("2".equals(selectedMnue)) {

        } else if ("b".equals(selectedMnue)) {
            responseDto.setStatus(100);
        } else {

        }
        return responseDto;

    }
}


