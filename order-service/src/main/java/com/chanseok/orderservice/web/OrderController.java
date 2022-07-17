package com.chanseok.orderservice.web;

import com.chanseok.orderservice.dto.CreateOrderRequest;
import com.chanseok.orderservice.dto.CreateOrderResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    public CreateOrderResponse order(CreateOrderRequest orderRequest) {

        return null;
    }
}
