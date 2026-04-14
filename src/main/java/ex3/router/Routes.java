package ex3.router;

import ex3.view.AccountInfoView;
import ex3.view.AccountView;
import ex3.view.HomeView;
import ex3.view.View;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

public enum Routes {
    Home(new HomeView()), Account(new AccountView()),AccountInfo(new AccountInfoView());//emum 생성될때 전부 한 번 생성된다

    @Getter
    private View view;//맴버 변수 존재

    Routes(View view) {
        this.view = view;
    }
}
