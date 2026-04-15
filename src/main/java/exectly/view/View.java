package exectly.view;

import java.util.Map;
import java.util.function.Function;

public interface View {
    void render();
    default void clear() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    default void basicLayout(Map<String, String> props) {
        //static이 아님 -> 생성자가 생성될때마다 재생성됨 -> 근데 interface는  생성자가 없음 -> 자식이 생성될때 같이 생성되나?
        clear();
        String header = String.format("======<< %s >>======", props.get("title"));
        String body = props.get("body");
        StringBuilder footer = new StringBuilder();
        for (int i = 0; i < header.length(); i++) {
            footer.append("=");
        }
        System.out.println(header);
        System.out.print(body);
        System.out.println(footer);
        System.out.println();
    }
}
