package com.chanseok.orderservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class CreateOrderRequest {
    private Long store;
    private String phone;
    private String orderMenu;
    private BigDecimal orderPrice;
    private BigDecimal deliveryPrice;
    private BigDecimal totalPrice;
    private String orderAddress;
    private String orderAddressDetail;
    private String requests;
    private String riderRequests;
    private String payment;
    private String coupon;

    @Builder
    public CreateOrderRequest(
                Long store
                , String phone
                , String orderMenu
                , BigDecimal orderPrice
                , BigDecimal deliveryPrice
                , BigDecimal totalPrice
                , String orderAddress
                , String orderAddressDetail
                , String requests
                , String riderRequests
                , String payment
                , String coupon
    ) {
        this.store = store;
        this.phone = phone;
        this.orderMenu = orderMenu;
        this.orderPrice = orderPrice;
        this.deliveryPrice = deliveryPrice;
        this.totalPrice = totalPrice;
        this.orderAddress = orderAddress;
        this.orderAddressDetail = orderAddressDetail;
        this.requests = requests;
        this.riderRequests = riderRequests;
        this.payment = payment;
        this.coupon = coupon;
    }
}
