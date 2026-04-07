package study.ch19;

import java.util.*;


public class SetMain {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        strSet.add("A");
        strSet.add("A");
        strSet.add("A");
        strSet.add("A");

        System.out.println(strSet);


        Set<User> userSet = new HashSet<>(Set.of(
                new User(1, "aaa"),
                new User(5, "aaa"),
                new User(3, "aaa"),
                new User(4, "aaa")
        ));
        System.out.println(userSet);

        int id = 3;
        for (User user : userSet) {
            if(user.getId() == id) {
                System.out.println("3번아이디 찾음");
                System.out.println(user);

            }
        }
    }
}
