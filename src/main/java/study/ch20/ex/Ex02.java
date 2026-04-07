package study.ch20.ex;

import java.util.*;

//문자열에서 각 문자(char)의 빈도를 Map으로 구하세요.
//
//"hello world"
public class Ex02 {
    public static void main(String[] args) {
        String hello = "hello world";
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i = 0; i < hello.length(); i++){
            char character = hello.charAt(i);
            if(!charMap.containsKey(character)) {
                charMap.put(character,1);
                continue;
            }
            charMap.put(character, charMap.get(character) + 1);
        }
        System.out.println(charMap);
    }

}
