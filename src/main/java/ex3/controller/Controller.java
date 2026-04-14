package ex3.controller;

import ex3.Main;
import ex3.dto.RepositCustomer;
import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.service.Account;
import ex3.service.Customer;

public class Controller {
    public static void HomeController (String number) {
        if (number.equals("1")) {
            RouterPath.current = Routes.Account.name();
        }else if (number.equals("2")) {

        }else if (number.equals("3")) {

        }else if (number.equals("4")) {
            RouterPath.current = Routes.Home.name();
            Account.printAll();

            System.out.println();
        }else if (number.equals("5")) {

        }else if (number.equals("6")) {

        }else if (number.equals("q")) {
            Main.key = false;
        }else{
            System.out.println("형식에 맞는 숫자를 입력해주세요");
        }
    }
    public static void AccountController(String number) {
        switch (number) {
            case "1":
                RouterPath.current = Routes.AccountInfo.name();
                System.out.println("계좌 생성 성공!");
                break;
            case "b":
                RouterPath.current = Routes.Home.name();
                break;
            default:
                System.out.println("형식에 맞는 숫자를 입력해주세요.");
                break;
        }
    }
    public static void nameController(String nameBalance){
        String[] infos = nameBalance.split("/");
        RepositCustomer.customer.add(new Customer(infos[0], Integer.parseInt(infos[1])));
        RouterPath.current = Routes.Account.name();
    }


}
