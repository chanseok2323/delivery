package com.chanseok.store.repository;

import com.chanseok.store.entity.OrderStore;
import com.chanseok.store.repository.custom.OrderStoreCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStoreRepository extends JpaRepository<OrderStore, Long>, OrderStoreCustom {
}
