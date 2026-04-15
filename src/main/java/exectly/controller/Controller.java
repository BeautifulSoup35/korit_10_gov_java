package exectly.controller;

import exectly.dto.ResponseDto;
import exectly.entity.Account;
import exectly.repository.AccountRepository;
import exectly.repository.AccountRepositoryImpl;
import exectly.router.RouterPath;
import exectly.router.Routes;
import exectly.util.Input;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Controller {

    public static ResponseDto<Map<String, Object>> homeController(String selectedMenu) {//메뉴값 매개변수로 받음
        ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());//200을 기본으로 넣고, data는 맵으로 넣음
        try {
            if ("1".equals(selectedMenu)) {
                RouterPath.current = Routes.CREATE_ACCOUNT.name();//CREATE_ACCOUNT 화면으로 전환
            } else if ("2".equals(selectedMenu)){//은행 서비스 이용하기
                RouterPath.current = Routes.ACCOUNT.name();
            } else if ("q".equals(selectedMenu)){
                responseDto.setStatus(100);//종료시에는 status 타입을 100으로 전환
            } else {
                throw new RuntimeException("해당 입력 값은 유효하지 않습니다. 다시 입력하세요.");
            }
        } catch (RuntimeException e) {
            Map<String, Object> errorMap = Map.of(
                    "message", e.getMessage()//에러 객체에 getMessage()라는 메소드가 있나 무슨 역할이지?
            );// 오류시에는 message를 반환할 맵을 만들고 message를 만들어 넣음
            responseDto = new ResponseDto<>(400, errorMap);// 잘못된 값을 넣으면 400을 반환하게 함
        }

        return responseDto;// 한 번 else에 걸리면 100dl 오류가 발생시 400과 errMap이 반환되는 ResponseDto 객체 반환
    }


    public static ResponseDto<?> getAccountListController() {
        List<Account> accountList = AccountRepositoryImpl.ACCOUNT_REPOSITORY.findAll();
        if (accountList.size() == 0) {
            return new ResponseDto<>(400, "조회된 계좌가 없습니다.");
        }
        return new ResponseDto<>(200, accountList);
    }

    public static ResponseDto<?> selectAccountController(int id) {
        Optional<Account> foundAccountOptional = AccountRepositoryImpl.ACCOUNT_REPOSITORY.findById(id);
        if (foundAccountOptional.isEmpty()) {
            return new ResponseDto<>(400, "해당 ID는 등록되지 않은 계좌정보입니다.");
        }
        return new ResponseDto<>(200, foundAccountOptional.get());
    }

    public static ResponseDto<?> accountMenuController(String selectedMenu) {
        ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
        try {
            if ("1".equals(selectedMenu)) {
                // 거래내역조회
            } else if ("2".equals(selectedMenu)){
                // 입금
            } else if ("3".equals(selectedMenu)){
                // 출금
            } else if ("b".equals(selectedMenu)){
                responseDto.setStatus(100);
            } else {
                throw new RuntimeException("해당 입력 값은 유효하지 않습니다. 다시 입력하세요.");
            }
        } catch (RuntimeException e) {
            Map<String, Object> errorMap = Map.of(
                    "message", e.getMessage()
            );
            responseDto = new ResponseDto<>(400, errorMap);
        }

        return responseDto;
    }

    public static ResponseDto<?> createAccountController(String selectedMenu) {
        ResponseDto<?> responseDto = new ResponseDto<>(200, null); // data타입을 모르는데 그냥 null로 비워놓을수가있나 list, string, Optional전부 null이 되는데?
        if ("1".equals(selectedMenu)) {
            // 계좌 생성
            System.out.println("계좌 생성 각 항목을 작성해주세요.");
            System.out.println("[계좌번호]");
            String accountNo = Input.nextLine();
            System.out.println("[예금주]");
            String owner = Input.nextLine();
            System.out.println("[잔액]");
            int balance = Integer.parseInt(Input.nextLine());//잔액은 string에서 int로 바꿈
            Account newAccount = new Account(0, accountNo, owner, balance);//회원들 객체인 account생성 id는 0
            Account savedAccount = AccountRepositoryImpl.ACCOUNT_REPOSITORY.save(newAccount);//회원정보 입력
            System.out.println("계좌생성완료 - 계좌정보");
            System.out.println(savedAccount);//newAccount가 그대로 나온다.
        } else if ("b".equals(selectedMenu)) {
            responseDto.setStatus(100);//뒤로가기 home에서의 종료와 status넘버가 같음
        } else {

        }

        return responseDto;//message없이 뒤로가기일대 상태값만 바뀌며return
    }
}














