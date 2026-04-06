package study.ch12.ex.ex6_10;

public class Ex10 {
    public static void main(String[] args) {
        Payment[] payments = new Payment[3];
        payments[0] = new CardPayment(3000);
        payments[1] = new Payment(3000);
        payments[2] = new CashPayment(5000);

        for(Payment p : payments) {
            p.pay();
        }
    }
}

class Payment {
    int amount;

    Payment(int amount) {
        this.amount = amount;
    }
    void pay(){
        System.out.println(amount + "원 결제");
    }
}

class CardPayment extends Payment {
    public CardPayment(int amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("카드결제 : " + amount + "원");
    }
}
class CashPayment extends Payment {
    public CashPayment(int amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("현금결제 : " + amount + "원");
    }
}
