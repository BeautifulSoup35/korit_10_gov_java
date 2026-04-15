package exectly.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {

    public static String nextLine() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("입력: ");
            return bufferedReader.readLine();
        } catch (IOException e) {
            return null;
        }
    }

    public static void nextWait() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("계속 하시려면 아무키나 입력하세요...");
            bufferedReader.readLine();
        } catch (IOException e) {
        }
    }
}










