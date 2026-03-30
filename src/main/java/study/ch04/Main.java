package study.ch04;

public class Main {
    public static void main(String[] args) {
        String name1 = "권민주";
        String name2 = "권민주";
        String name3 = new String("권민주");
        boolean result1 = name1 == name2;
        boolean result2 = name1.equals(name3);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println(result1);
        System.out.println(result2);
    }
    //문자열 후위, 타입형
}
