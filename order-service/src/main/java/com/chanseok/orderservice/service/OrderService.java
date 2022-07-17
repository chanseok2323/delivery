package com.chanseok.orderservice.service;

import com.chanseok.orderservice.dto.CreateOrderRequest;
import com.chanseok.orderservice.dto.CreateOrderResponse;
import com.chanseok.orderservice.repository.CouponRepository;
import com.chanseok.orderservice.repository.OrderDetailRepository;
import com.chanseok.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;
    private OrderDetailRepository orderDetailRepository;
    private CouponRepository couponRepository;

    public CreateOrderResponse save(CreateOrderRequest request) {

        return null;
    }
}
