package com.chanseok.restaurantservice.repository;

import com.chanseok.restaurantservice.entity.Store;
import com.chanseok.restaurantservice.repository.custom.StoreRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {
    Optional<Store> findByNo(Long no);
}
