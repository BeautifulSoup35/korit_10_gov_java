package study.ch20;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.*;


@Data
@Builder
public class Order {
    private int orderNumber;
    private List<OrderDetail> orderDetails;
    private LocalDateTime orderDateTime;

}
