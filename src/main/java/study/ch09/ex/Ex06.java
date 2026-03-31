package study.ch09.ex;

public class Ex06 {

}
class BankAccount{
    String owner;
    int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    void deposit(int amount) {
        if(amount < 0) balance += amount;
    }
    void withdraw(int amount) {
        if(balance - amount < 0){
            System.out.println("잔액부족");
        }
        else{
            balance -= amount;
            System.out.println("출금완료");
        }
    }

    void printBalance() {
        System.out.println(balance);
    }
}
