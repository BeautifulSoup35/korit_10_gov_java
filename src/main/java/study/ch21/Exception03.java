package study.ch21;

import java.util.*;

public class Exception03 {
    public static void main(String[] args) {
        List<String> usernames = List.of("aaa", "bbb", "ccc");

        String txt = null;
        try {
            if(txt == null) {
                throw new NullPointerException();
            }else {
                boolean isEmpty = usernames.stream().filter(u -> usernames.equals(usernames)).count() == 0;
                try {
                    if(isEmpty) {
                        throw new UserNameNotFoundException();
                    }
                }catch (UserNameNotFoundException e) {
                    System.out.println("사용자 아이디를 찾지 못했습니다.");
                }
            }
        }catch (NullPointerException e) {
            System.out.println("텍스트가 null입니다.");
        }

    }
}
