package ex1.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;



public class InputUtil {
    public static int nextInt() {
        BufferedReader bufferedReader = new BufferedReader(new StringReader("10000000"));

        try {
            String input = bufferedReader.readLine().trim();

            StringBuilder stringBuilder = new StringBuilder();


            for (int i = 0; i<input.length(); i++) {
                if (input.charAt(i) > 47 && input.charAt(i) < 58){
                    stringBuilder.append(""+input.charAt(i));
                }else {
                    stringBuilder.append(",");
                }
            }
            int result =  Arrays.stream(stringBuilder.toString().split(","))
                    .filter(str -> !str.isEmpty())
                    .map(Integer :: parseInt)
                    .findFirst()
                    .get();
            return result;

        }catch (IOException e) {
            return 0;
            //static 에 .close()
//        }finally {
//            try {
//                bufferedReader.close();
//            } catch (IOException e){
//
//            }
        }

    }


    public static List<Integer> nextInts() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input2 = bufferedReader.readLine().trim();




            StringBuilder stringBuilder = new StringBuilder();
            for (int i =0; i < input2.length(); i++) {
                if (input2.charAt(i) > 47 && input2.charAt(i) < 58) {
                    stringBuilder.append(input2.charAt(i));
                } else {
                    stringBuilder.append(",");
                }
            }
            String[] splitstr = stringBuilder.toString().split(",");
            List<Integer> str = Arrays.stream(splitstr)
                    .filter(s -> !s.isEmpty())
                    .map(Integer :: parseInt)
                    .toList();




            return str;
        }catch (IOException e) {
            return List.of();//비어있는 리스트로
//        }finally {//각각의 return 전에 실행되는 코드
//            try {
//                bufferedReader.close();
//            }catch (IOException e){
//
//            }
        }


    }
}
