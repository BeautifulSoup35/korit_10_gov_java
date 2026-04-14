package ex3;

import ex3.controller.Controller;
import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.util.Input;
import ex3.view.HomeView;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//문제 2. 은행 계좌 관리 프로그램
//설계서
//기능 요구사항:
//
//계좌 생성 (이름, 초기 잔액)
//입금 / 출금 (잔액 부족 시 사용자 정의 예외)
//계좌 조회 (계좌번호로)
//전체 계좌 목록
//거래 내역 저장 및 출력
//
//클래스 설계:
//[Model]
//├── Account
//│   - int accountNo (static 자동 채번)
//│   - String owner, int balance
//│   - void deposit(int amount)
//│   - void withdraw(int amount) throws InsufficientBalanceException
//├── Transaction
//│   - String type ("입금"/"출금"), int amount, int balanceAfter, String dateTime
//├── InsufficientBalanceException extends RuntimeException
//
//[Controller / Service]
//├── BankService
//│   - Map<Integer, Account> accounts
//│   - List<Transaction> history
//│   - Account createAccount(String owner, int balance)
//│   - Account findByNo(int no)
//│   - void deposit(int accountNo, int amount)
//│   - void withdraw(int accountNo, int amount)
//│   - List<Transaction> getHistory()
//
//[View]
//├── Main
//│   - 1.계좌생성 2.입금 3.출금 4.계좌조회 5.전체목록 6.거래내역 7.종료
//활용 개념: static(자동 채번), 사용자 정의 예외, Map, ArrayList, try-catch, 캡슐화
public class Main {
    public static boolean key = true;

    public static void main(String[] args) {

        System.out.println("프로그램 실행");
        while (key) {
            Routes.valueOf(RouterPath.current).getView().render();


        }


    }
}
