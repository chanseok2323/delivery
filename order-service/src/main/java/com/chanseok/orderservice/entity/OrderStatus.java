package com.chanseok.orderservice.entity;

public enum OrderStatus {
    ORDERING("주문중"), ORDER_DENY("주문거부"), ORDER_ACCEPT("주문승낙"), ORDER_COOK("조리중"), ORDER_DELIVERY("배달중"), FINISH("완료");

    private String orderStatus;

    OrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
