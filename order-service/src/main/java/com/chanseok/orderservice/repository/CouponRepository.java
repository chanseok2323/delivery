package com.chanseok.orderservice.repository;

import com.chanseok.orderservice.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
