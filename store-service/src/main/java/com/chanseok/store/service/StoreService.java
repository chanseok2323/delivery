package com.chanseok.store.service;

import com.chanseok.store.dto.MenuDto;
import com.chanseok.store.dto.StoreDto;
import com.chanseok.store.entity.Store;
import com.chanseok.store.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreRepository storeRepository;

    public List<StoreDto.Response> findAll() {
        return storeRepository.findAll()
                .stream().map(entity -> new StoreDto.Response(entity)).collect(Collectors.toList());
    }

    public void save(Store store) {
        storeRepository.save(store);
    }

    public StoreDto.DetailResponse findByNo(Long no) {
        Store store = storeRepository.findByNo(no)
                .orElseThrow(() -> new IllegalArgumentException("에러 발생"));
        List<MenuDto> menus = storeRepository.findByStoreNo(no);
        return StoreDto.DetailResponse.of(store.getNo(), store.getName(), menus);
    }
}
