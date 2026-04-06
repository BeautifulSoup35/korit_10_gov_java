package study.ch17;


public class UserRepository {
    private static UserRepository instance;
    private User[] users;
    private Long lastCreatedId = 0L;

    private UserRepository(){
    }

    public static UserRepository getInstance(){
        if(instance == null) instance = new UserRepository();
        return instance;
    }

    public void setUsers(User[] users){
        if (this.users == null) {
            this.users = users;
            return;
        }
        System.out.println("이미 정의된 사용자 배열이 존재합니다.");
    }
    public boolean addUser(User user) {//유저 객체가 통으로 넘어온다
        boolean isSuccess = false;
        for ( int i = 0; i < users.length; i++){
            if(users[i] == null){
                user.setId(++lastCreatedId);
                users[i] = user;
                isSuccess = true;
                break;//값 넣어지면 for문 멈추기
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
