package ex2.view;

import java.util.*;

public interface View {
    void render();
//    default void  clear () {
//        for (int i = 0; i < 8; i++) {
//            System.out.println();
//        }
//    }

    default void basicLayout(Map<String, String>props) {
//        clear();
        String header = String.format("====<< %s >>=====\n", props.get("title"));
        String body = props.get("body");
        StringBuilder footer = new StringBuilder();
        for (int i =0; i < header.length(); i++){
            footer.append("=");
        }
        System.out.print(header);
        System.out.print(body);
        System.out.print(footer);//오브젝트를 넣으면 자동으로 toStriung
        System.out.println();
    }
}
