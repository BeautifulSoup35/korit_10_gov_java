package ex2.Repository;

import ex2.entity.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public enum AccountRepositoryImpl implements AccountRepository {
    ACCOUNT_REPOSITORY;
    private List<Account> accountList;
    private int autoincrementId = 0;

    AccountRepositoryImpl() {
        accountList = new ArrayList<>();
    }//private으로 쓰고 싶을때

    @Override
    public Account save(Account account) {
        findById(account.getId()).ifPresentOrElse(foundAccount ->
                    foundAccount.update(account)//객체를 넣어서 객체의 값에 새롭게 넣는다
                , () ->{
                    account.setId(++autoincrementId);
                    accountList.add(account);
                });


        return account;
    }

    @Override
    public Optional<Account> findById(int id) {
        return accountList.stream().filter(account1 -> account1.getId() == id).findFirst();
    }

    @Override
    public Optional<Account> findByAccountNo(String accountNo) {
        return accountList.stream().filter(account1 -> account1.getAccountNo().equals(accountNo)).findFirst();
    }

    @Override
    public List<Optional<Account>> findAll() {
        return accountList.stream().map(account2 -> Optional.of(account2)).toList();//옵셔널로 감싸서 tolist


    }
}
