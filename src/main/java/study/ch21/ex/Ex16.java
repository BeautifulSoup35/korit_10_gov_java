package study.ch21.ex;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class ShopException extends Exception {
    private String messege;
}


class PaymentException extends ShopException {
    public PaymentException(String messege) {
        super(messege);
    }
}
class OrderException extends ShopException {
    public OrderException(String messege) {
        super(messege);
    }
}

class InsufficienBalanceException extends PaymentException{
    public InsufficienBalanceException(String messege) {
        super(messege);
    }

}

class CardExpiredException extends PaymentException {
    public CardExpiredException(String messege) {
        super(messege);
    }
}
class OutOfStockException extends OrderException {
    public OutOfStockException(String messege) {
        super(messege);
    }
}

public class Ex16 {
    public static void main(String[] args) {
        try {
            throw new OutOfStockException("재고가 부족합니다");
        } catch (OutOfStockException e) {
            e.printStackTrace();
        }

    }
}
