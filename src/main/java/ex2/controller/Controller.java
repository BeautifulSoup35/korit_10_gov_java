package ex2.controller;


import ex2.Repository.*;
import ex2.dto.*;
import ex2.entity.*;
import ex2.router.*;
import ex2.util.*;
import java.util.*;

public class Controller {
    public static ResponseDto<Map<String, Object>> homeController(String selectedMenu) {
        ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
        try {
            if ("1".equals(selectedMenu)) {
                RouterPath.current = Routes.CREATE_ACCOUNT.name();
            } else if ("2".equals(selectedMenu)) {
                RouterPath.current = Routes.ACCOUNT.name();

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

    public static ResponseDto<?> getAccountListController() {
        ResponseDto<?> responseDto;
        List<Account> accountList = AccountRepositoryImpl.ACCOUNT_REPOSITORY.findAll();
        if (accountList.size() == 0) {//가지고온 account가 비어있다면
            return new ResponseDto<>(400, "조회된 계좌");
        }
        return new ResponseDto<>(200, accountList);
    }

    public static ResponseDto<?> selectAccountController(int id) {
        Optional<Account> foundAccountOptional = AccountRepositoryImpl.ACCOUNT_REPOSITORY.findById(id);
        if (foundAccountOptional.isEmpty()) {
            return new ResponseDto<>(400, "해당 ID는 등록되지 않은 계좌정보입니다.");
        }
        return new ResponseDto<>(200, foundAccountOptional.get());//옵셔널의 get == 옵셔널의 객체

    }

    public static ResponseDto<?> accountMenuController(String selectedMenu) {
        ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
        try {
            if ("1".equals(selectedMenu)) {
                RouterPath.current = Routes.CREATE_ACCOUNT.name();
            } else if ("2".equals(selectedMenu)) {
                RouterPath.current = Routes.ACCOUNT.name();

            } else if ("q".equals(selectedMenu)) {
                responseDto.setStatus(100);
            } else {
                throw new RuntimeException("해당값을 유효하지 않습니다.");
            }
        } catch (RuntimeException e) {
            Map<String, Object> errorMap = Map.of(
                    "message", e.getMessage()

            );
            responseDto = new ResponseDto<>(400, errorMap);

        }
        return responseDto;
    }

    public static ResponseDto<?> createaccountController (String selectedMnue){
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
            System.out.println("계좌생성완료 - 계좌정보");
            System.out.println(savedAccount);//수정 요구

        } else if ("b".equals(selectedMnue)) {
            RouterPath.current = Routes.ACCOUNT.name();
            responseDto.setStatus(100);
        } else {

        }
        return responseDto;

    }
}



