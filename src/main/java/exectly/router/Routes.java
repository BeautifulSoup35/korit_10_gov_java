package exectly.router;

import exectly.view.AccountView;
import exectly.view.CreateAccountView;
import exectly.view.HomeView;
import exectly.view.View;
import lombok.Getter;

public enum Routes {
    HOME(new HomeView()),
    CREATE_ACCOUNT(new CreateAccountView()),
    ACCOUNT(new AccountView()),
    DEPOSIT(null),
    WITHDRAWAL(null);

    @Getter
    private View view;

    Routes(View view) {
        this.view = view;
    }
}
