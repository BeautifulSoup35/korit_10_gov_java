package study.ch18;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder
public class ErrorResponse {
    private int code;
    private Object body;


    public static <T> void print(T data) {
        System.out.println(data);
    }

    public static <T, R> R print2(T data, R returndata) {
        System.out.println(data);
        return returndata;
    }
}
