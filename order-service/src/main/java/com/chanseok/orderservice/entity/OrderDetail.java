package com.chanseok.orderservice.entity;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Entity
public class OrderDetail extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_no")
    private Long no;

    @ManyToOne
    @JoinColumn(name = "order_no")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "coupon_no")
    private Coupon coupon;

    @Column(name = "order_menu")
    private String menu;

    private BigDecimal orderPrice;
    private BigDecimal deliveryPrice;
    private BigDecimal totalPrice;
    private String orderAddress;
    private String orderAddressDetail;
    private String requests;
    private String riderRequests;
    private String payment;

    protected OrderDetail() {
    }

    public OrderDetail(
            Order order
            , Coupon coupon
            , String menu
            , BigDecimal orderPrice
            , BigDecimal deliveryPrice
            , BigDecimal totalPrice
            , String orderAddress
            , String orderAddressDetail
            , String requests
            , String riderRequests
            , String payment
    ) {
        this.order = order;
        this.coupon = coupon;
        this.menu = menu;
        this.orderPrice = orderPrice;
        this.deliveryPrice = deliveryPrice;
        this.totalPrice = totalPrice;
        this.orderAddress = orderAddress;
        this.orderAddressDetail = orderAddressDetail;
        this.requests = requests;
        this.riderRequests = riderRequests;
        this.payment = payment;
    }
}
