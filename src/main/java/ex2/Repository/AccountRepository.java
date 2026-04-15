package ex2.Repository;

import ex2.entity.Account;

import java.util.*;

public interface AccountRepository {
    Account save(Account account);
    Optional<Account> findById(int id);
    Optional<Account> findByAccountNo(String accountNo);
    List<Account> findAll();

}
