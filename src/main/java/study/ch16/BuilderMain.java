package study.ch16;

public class BuilderMain {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity("aaa", "1234", "권민주", "aa@gmail.com");
        UserEntity userEntity2 = new UserEntity("aaa", null, null, "aa@gmail.com");
        UserEntity userEntity3 = new UserEntity();
        userEntity3.setUsername("bb");
        UserEntity userEntity4 = UserEntity.builder().
                username("ccc").
                password("111").
                name("권당김").
                email("q@gmail.com").
                build();//static -> 객체 생성 -> 객체 메소드 접근
        UserEntity2 userEntity5 = UserEntity2.builder().
                build();


    }
}
