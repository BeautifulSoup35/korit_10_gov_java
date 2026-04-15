package exectly.repository;

import exectly.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    Account save(Account account);
    Optional<Account> findById(int id);
    Optional<Account> findByAccountNo(String accountNo);
    List<Account> findAll();
}
