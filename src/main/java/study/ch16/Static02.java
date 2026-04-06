package study.ch16;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

@Data
@AllArgsConstructor
class User {
    private Long id;
    private String userName;
    private String password;
}

class UserRepository {
    private final User[] users;
    private Long lastCreatedId = 0L;

    public UserRepository(User[] users) {//배열에 관한 의존성 추가
        this.users = users;
    }

    public boolean addUser(User user) {//유저 객체가 통으로 넘어온다
        boolean isSuccess = false;
        for ( int i = 0; i < users.length; i++){
            if(users[i] == null){
                user.setId(++lastCreatedId);
                users[i] = user;
                isSuccess = true;
                break;
            }
        }
        if (!isSuccess) {
            System.out.println("사용자 추가 실패");
            return isSuccess;
        }
        System.out.println("사용자 추가 성공!");
        System.out.println("추가된 사용자 정보: " + user);
        return isSuccess;
    }
    public User findByUsername(String username) {
        for(User user : users){
            if (user == null) continue;
            if (user.getUserName().equals(username)){
                return user;
            }
        }
        return null;
    }


    public void printUsers() {
        System.out.println("사용자 전체 조회");
        for(User user : users){
            System.out.println(user);
        }
    }

}
class UserService {
    private UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public int singUp(String username, String password) {
        //성공  : 200
        //실패 ; 400(중복 아이디), 500(공간부족)

        User foundUser = userRepository.findByUsername(username);
        if (foundUser != null){
            return 400;
        }

        User newUser = new User(0l, username, password);
        boolean isSuccess = userRepository.addUser(newUser);//초기화된 user객체 넘기기
        if(!isSuccess){
            return 500;
        }
        userRepository.printUsers();
        return 200;
    }
}
//뭔말알 시전
//안어려워요 시전
//수업공격
//식곤증 공격
//코드 작두타기

class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void postMapping(String username, String password) {
        int status = userService.singUp(username, password);

        switch (status) {
            case 200:
                System.out.println("회원 등록 성공");
                break;
            case 400:
                System.out.println("중복된 사용자 이름입니다.");
                break;
            case 500:
                System.out.println("데이터를 더이상 추가할 수 없습니다.");
                break;
        }
    }

}


public class Static02 {
    public static void main(String[] args) {
        String[] usernames = new String[500];
        String[] passwords = new String[500];
        for (int i =0; i < 500; i++){
            Random random =new Random();

            usernames[i] = "";

            for(int j = 0; j < 10; j++){//string 무작위로 담기
                int r = random.nextInt(26) + 97;//0~25 // 시작은 97부터
                usernames[i] += (char) r;

            }
            usernames[i] += "@gmail.com";
            passwords[i] = UUID.randomUUID().toString().replaceAll("-","");

        }

        System.out.println(Arrays.toString(usernames));
        System.out.println(Arrays.toString(passwords));

        User[] users = new User[100];
        UserRepository userRepository = new UserRepository(users);
        UserService userService = new UserService(userRepository);

        UserController userController = new UserController(userService);
        for(int i =0; i< 500; i++){
            userController.postMapping(usernames[i], passwords[i]);
        }



    }
}
