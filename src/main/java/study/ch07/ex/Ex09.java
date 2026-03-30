package study.ch07.ex;

public class Ex09 {
    public static void main(String[] args) {
        int month = 7;
        if(month > 11 && month < 3){
            System.out.println("겨울");
        }else if (month > 8){
            System.out.println("가을");
        }else if (month > 5){
            System.out.println("여름");
        }else {
            System.out.println("봄");
        }
    }
}
