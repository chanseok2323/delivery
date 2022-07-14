package com.chanseok.restaurantservice.service;

import com.chanseok.restaurantservice.dto.CreateStoreRequest;
import com.chanseok.restaurantservice.dto.MenuDto;
import com.chanseok.restaurantservice.dto.StoreDetailResponse;
import com.chanseok.restaurantservice.entity.Store;
import com.chanseok.restaurantservice.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreRepository storeRepository;

    public List<CreateStoreRequest> findAll() {
        return storeRepository.findAll()
                .stream().map(entity -> CreateStoreRequest.of(entity)).collect(Collectors.toList());
    }

    public void save(CreateStoreRequest storeDto) {
        storeRepository.save(new Store(storeDto.getName()
                , storeDto.getLocation()
                , storeDto.getLocationDetail()
                , storeDto.getStartBusinessTime()
                , storeDto.getEndBusinessTime())
        );
    }

    public StoreDetailResponse findByNo(Long no) {
        Store store = storeRepository.findByNo(no)
                .orElseThrow(() -> new IllegalArgumentException("에러 발생"));
        List<MenuDto> menus = storeRepository.findByStoreNo(no);
        return StoreDetailResponse.of(store.getNo(), store.getName(), menus);
    }
}
