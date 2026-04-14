package ex3.util;

import ex3.Main;
import ex3.view.HomeView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static String input() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            return reader.readLine();
        } catch (IOException e) {
            return null;
        }

    }


}
