package guru.sfg.brewery.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
public class BeerOrder {

    private UUID id;

    private Long version;

    private Timestamp createdDate;

    private Timestamp lastModifiedDate;

    private String customerRef;

    private OrderStatusEnum orderStatus = OrderStatusEnum.NEW;

    private String orderStatusCallbackUrl;



}
