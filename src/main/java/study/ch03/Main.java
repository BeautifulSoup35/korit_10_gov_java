package study.ch03;

public class Main {
    public static void main(String[] args) {
        //증감연산
        System.out.println("a");

        int a = 10;
        System.out.println(a + 10);
        a += 1;
        System.out.println(a + 10);

        System.out.println("b");
        int b = 10;
        System.out.println(b++ + 10);
        System.out.println(b + 10);


        System.out.println("c");
        int c = 10;
        c += 1;
        System.out.println(c + 10);
        System.out.println(c  + 10);

        System.out.println("d");

        int d = 10;
        System.out.println(++d + 10);
        System.out.println(d + 10);


        int e = 100;
        System.out.println(e);
        System.out.println(--e);
        System.out.println(++e);
        System.out.println(++e);
        System.out.println(++e);
        System.out.println(e);



        //비교연산자
        System.out.println(10 > 5);
        boolean status = 10 > 5;
        System.out.println(status);
        boolean status2 = 10 +2 >10;
        System.out.println(status2);

        int num = 5;
        boolean evnet = 5 % 2 == 0;

        int f = 1000;
        int g = f++;
        System.out.println(f);
        System.out.println(g);
        g = f;
        System.out.println(g);
    }
}
