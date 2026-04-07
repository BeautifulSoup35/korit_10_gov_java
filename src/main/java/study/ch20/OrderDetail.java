package study.ch20;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class OrderDetail {
    private int number;
    private Product product;
    private int stock;
}
