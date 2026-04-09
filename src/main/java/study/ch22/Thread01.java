package study.ch22;

import java.util.TreeMap;

public class Thread01 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for(int i =0; i< 10; i++) {
                System.out.println("t1 :"  + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread1 = new Thread(() -> {
            for(int i =0; i< 10; i++) {
                System.out.println("t2 :"  + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread.start();
    }
}
