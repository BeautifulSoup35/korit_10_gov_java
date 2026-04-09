package study.ch22;

interface Calcuator {
    int clarc (int x, int y);

}

public class Lamda01 {
    public static void main(String[] args) {
        Calcuator c2 = new Calcuator() {
            @Override
            public int clarc(int x, int y) {
                return x + y;
            }
        };

        Calcuator c1 = (int a, int b) -> {
            return a + b;
        };

        Calcuator c = (a, b) -> a + b;


        int result = c.clarc(1,2);
        System.out.println(result);
         result = c1.clarc(1,2);
        System.out.println(result);
         result = c2.clarc(1,2);
        System.out.println(result);


    }


}
