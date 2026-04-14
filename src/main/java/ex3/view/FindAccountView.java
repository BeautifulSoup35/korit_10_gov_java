package ex3.view;

import ex3.service.Account;
import ex3.util.Input;

public class FindAccountView implements View{
    @Override
    public void render() {
        nameAsk();
        Account.findCustomer(Input.input());
    }
    public void nameAsk() {
        System.out.println("귀하의 이름을 작성해주세요 : ");
    }
}
