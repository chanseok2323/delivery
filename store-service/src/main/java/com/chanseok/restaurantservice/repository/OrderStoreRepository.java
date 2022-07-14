package com.chanseok.restaurantservice.repository;

import com.chanseok.restaurantservice.entity.OrderStore;
import com.chanseok.restaurantservice.repository.custom.OrderStoreCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStoreRepository extends JpaRepository<OrderStore, Long>, OrderStoreCustom {
}
