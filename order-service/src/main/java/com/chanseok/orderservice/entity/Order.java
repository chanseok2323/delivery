package com.chanseok.orderservice.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "order_no")
    private Long no;

    @Column(name = "store_no")
    private Long store;

    private OrderStatus orderStatus;
    private LocalDateTime orderRequestTime;

    protected Order() {
    }

    public Order(
            Long store
            , OrderStatus orderStatus
            , LocalDateTime orderRequestTime
    ) {
        this.store = store;
        this.orderStatus = orderStatus;
        this.orderRequestTime = orderRequestTime;
    }
}
