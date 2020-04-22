package guru.sfg.brewery.demo.domain;

import java.sql.Timestamp;
import java.util.UUID;

public class BeerOrder {

    private UUID id;

    private Long version;

    private Timestamp createdDate;

    private Timestamp lastModifiedDate;

    private String customerRef;

    private OrderStatusEnum orderStatus = OrderStatusEnum.NEW;

    private String orderStatusCallbackUrl;



}
