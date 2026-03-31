package study.ch09.entity;

public class User {
    private String username;// 사용자 이름 아이디
    private String password;
    private String name;

    public User(String username, String password, String name){
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public User(String username, String password){
        this(username, password, "공백");
    }

    public User(String username){
        this(username, "1234", "공백");
    }

    public String getUsername() {
        return username.substring(0, name.length()-1);
        //substring -> n전까지 자른다 n은 포함 안함
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name + "님";
    }
}
