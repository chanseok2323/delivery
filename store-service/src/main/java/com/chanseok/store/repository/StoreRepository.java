package com.chanseok.store.repository;

import com.chanseok.store.entity.Store;
import com.chanseok.store.repository.custom.StoreRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {
    Optional<Store> findByNo(Long no);
}
