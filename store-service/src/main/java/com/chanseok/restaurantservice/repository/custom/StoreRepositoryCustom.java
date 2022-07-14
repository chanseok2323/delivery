package com.chanseok.restaurantservice.repository.custom;

import com.chanseok.restaurantservice.dto.MenuDto;

import java.util.List;

public interface StoreRepositoryCustom {
    List<MenuDto> findByStoreNo(Long no);
}
