package com.chanseok.store.repository.custom;

import com.chanseok.store.dto.MenuDto;

import java.util.List;

public interface StoreRepositoryCustom {
    List<MenuDto> findByStoreNo(Long no);
}
