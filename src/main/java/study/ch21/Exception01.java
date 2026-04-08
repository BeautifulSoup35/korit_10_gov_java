package study.ch21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;

public class Exception01 {
    public static void unchecked() {
        System.out.println("프로그램 실행");
        int a= 10 /0;
        System.out.println("program end");
    }

    public static void checked() {
        System.out.println("프로그램 실행");
        try {
            FileReader fileReader = new FileReader("text.txt");
        }catch (FileNotFoundException f) {
                f.printStackTrace();//스택샇으면서 예외값이 뭔지 순차적으로 알려줘라
        }
        System.out.println("program end");

    }

    public static void main(String[] args) {
        checked();//unreported exception
    }
}
