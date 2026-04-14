package ex2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto<T> {// 계좌 확인
    private int status;
    private T date;
}
