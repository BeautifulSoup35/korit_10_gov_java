package study.ch16;

import lombok.*;

@Builder
class UserEntity2 {
    private String username;
    private String password;
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {//이상하네 왜 얘가 static이 아닌걸까
    private String username;
    private String password;
    private String name;
    private String email;

    static class UserBuilder {
        private String username;
        private String password;
        private String name;
        private String email;

        public UserEntity build() {
            return new UserEntity(username, password, name, email);//allargument
        }

        //인스턴스 메소드들 유저빌더 호출시에만 사용가능
        public UserBuilder username(String username) {
            this.username = username;
            return this;//자기자신의 주소
        }
        public UserBuilder password(String password) {
            this.password = password;
            return this;//자기자신의 주소
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;//자기자신의 주소
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;//자기자신의 주소
        }

    }



    public static UserBuilder builder(){
        return new UserBuilder();
    }


}
