package study.ch18;

import study.ch17.User;


public class Main {
    public static void main(String[] args) {
//        ErrorRespose er = ErrorRespose.builder().
//                code(400).
//                body(User.builder().build()).
//                build();
        ErrorResponse er = new ErrorResponse(400, User.builder().build());

        User user = (User) er.getBody();// Odject -> User
        System.out.println(user.getUserName());
        System.out.println(((User)er.getBody()).getUserName());

        SuccessResponse<User> sr = new SuccessResponse<>(200, User.builder().build());
        User user2 = sr.getBody();

        System.out.println(user2.getUserName());

        ErrorResponse.print(User.builder().userName("test").password("1234").build());
        ErrorResponse.print(10);
        ErrorResponse.print("문");

        String a = ErrorResponse.print2(30, "반환데이터 string");
        System.out.println(a);

        SuccessResponse<String> sr2 = new SuccessResponse<>(20,"성공");
        SuccessResponse<Integer> sr3 = new SuccessResponse<>(20,30);//Mapping된 상태로 들어가게됨

        Integer b = sr3.getBody();

        Wildcard.print2(new SuccessResponse<>(200, new HighStudent()));
        Wildcard.print2(new SuccessResponse<>(201, new Student()));

        Wildcard.print3(new SuccessResponse<Student>(202,new Student()));
        Wildcard.print3(new SuccessResponse<>(203,new Person()));
//        Wildcard.print3(new SuccessResponse<HighStudent>(203,new HighStudent())); //하한제한 걸림
    }
}
