package ex3.service;

import ex3.dto.RepositCustomer;
import ex3.util.Input;
import ex3.view.AccountInfoView;

import java.util.*;

public class Account {

    void deposit(int amount){//예금

    }
    void withdraw(int amount) throws InsufficientBalanceException{//출금

    }
    public static void printAll() {
        System.out.println(RepositCustomer.customer);
    }
    public static List<Integer> findCustomer (String name){
        List<Integer> all = new ArrayList<>();
        for(Customer c : RepositCustomer.customer){
            if(c.getOwner().equals(name)) {
                all.add(c.getAccountFinal());
            }
        }
        return all;

    }
}
