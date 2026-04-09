package study.ch22;

import com.sun.nio.sctp.AbstractNotificationHandler;
import lombok.AllArgsConstructor;

import java.util.*;
import java.util.function.Function;

@AllArgsConstructor
class CustomStream <T, R> {
    private List<T> list;

    public List<R> map(Function<T, R> funtion) {
        List<R> newList = new ArrayList<>();
        for (T data : list) {
            newList.add(funtion.apply(data));
        }
        return newList;
    }
}
public class Stream01 {
    public static void main(String[] args) {
        //map 반복 치환
        List<String> str = List.of("10","20","30","40");
        List<Integer> nums = new ArrayList<>();
        for(String s : str) {
            nums.add(Integer.parseInt(s));
        }

        System.out.println(nums);

//        System.out.println(str.stream().map(str1 -> Integer.parseInt(str1) * 10).toList());

        CustomStream<String, Integer> customStream = new CustomStream<>(str);
        List<Integer> nums2 = customStream.map(str1-> Integer.parseInt(str1) * 10);
            Function<String, Integer> f= str1 -> Integer.parseInt(str1) * 10;
             List<Integer> nums3 = customStream.map(f);
        System.out.println(nums3);
//        System.out.println(new CustomStream<String, Integer>(str).map(str1-> Integer.parseInt(str1) * 10));

        CustomStream<String, String> customStream2 = new CustomStream<>(List.of("권민","권중","권고"));
        System.out.println(customStream2.map(name->"김" + name));;

        System.out.println(List.of("권민","권중","권민").stream().map(name -> name + "씨").toList());
    }
}
