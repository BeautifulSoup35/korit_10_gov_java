package exectly.repository;

import exectly.entity.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public enum AccountRepositoryImpl implements AccountRepository {
    ACCOUNT_REPOSITORY; //AccountRepositoryImpl를 가지고 있는 객체의 칭호

    private List<Account> accountList;//AccountRepoitoryImpl가 생성될때마다 겍체가 새로 할당됨 == reposit은 하나여야하는거 아닌가? 그럼 싱클톤이여야하는거 아닌가?

    private int autoincrementId = 0;

    AccountRepositoryImpl() {
        accountList = new ArrayList<>();
    }

    @Override
    public Account save(Account account) {//회원 등록
        findById(account.getId()).ifPresentOrElse(//가져온 회원Optional이 null이 아니니?
                foundAccount -> foundAccount.update(account),//아니면 그 회원(타입 : Account?)을 너가 가져온 account로 update해
                () -> {
                    account.setId(++autoincrementId);//만약 null이면 너가가져온 회원정보의 id를 1증가시키고
                    accountList.add(account);//회원list에 너가 가져온 회원을 등록시켜
                }
        );

        return account;//너가 가져온 회원 정보 그대로 내보내
    }

    @Override
    public Optional<Account> findById(int id) {
        return accountList.stream().filter(account -> account.getId() == id).findFirst();//회원 list에서 id가 같은것중 가장 먼저 찾은 회원정보를 전부 Optional에 담아서 가져와라
    }

    @Override
    public Optional<Account> findByAccountNo(String accountNo) {//계좌번호로 회원찾기
        return accountList.stream().filter(account -> account.getAccountNo().equals(accountNo)).findFirst();//
    }

    @Override
    public List<Account> findAll() {//list 전부 print
        return accountList;
    }
}
