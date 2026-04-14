package ex3.service;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
public class Customer {
    private String owner;
    private int balance;
    private final int accountFinal;
    private int account = 10000;

    public Customer(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
        this.accountFinal = ++account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accountFinal=" + accountFinal +
                ", balance=" + balance +
                ", owner='" + owner + '\'' +
                '}';
    }
}
