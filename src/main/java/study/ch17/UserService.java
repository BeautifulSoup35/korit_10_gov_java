package study.ch17;


public class UserService {
    private UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public int singUp(String username, String password) {
        //성공  : 200
        //실패 ; 400(중복 아이디), 500(공간부족)

        User foundUser = userRepository.findByUsername(username);
        if (foundUser != null){//찾은것
            return 400;
        }

        User newUser = User.builder().
                userName(username).
                password(password).
                build();

        boolean isSuccess = userRepository.addUser(newUser);//초기화된 user객체 넘기기
        if(!isSuccess){
            return 500;
        }
        userRepository.printUsers();
        return 200;
    }
}
