package com.chanseok.store.entity;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Entity
@Table(name = "order_store")
public class OrderStore {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_store_no")
    private Long no;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_no")
    private Store store;

    private Long orderNo;
    private Long orderUser;
    private String orderMenu;
    private BigDecimal price;
    private String address;
    private String requests;
    private Integer paymentYn;

}
