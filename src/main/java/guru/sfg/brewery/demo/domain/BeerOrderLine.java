package guru.sfg.brewery.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
public class BeerOrderLine {

    private UUID id;

    private Long version;

    private Timestamp createdDate;

    private Timestamp lastModifiedDate;

    private BeerOrder beerOrder;

    private Beer beer;

    private Integer orderQuantity = 0;

    private Integer quantityAllocated = 0;

}
