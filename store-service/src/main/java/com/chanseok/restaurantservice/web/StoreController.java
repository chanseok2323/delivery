package com.chanseok.restaurantservice.web;

import com.chanseok.restaurantservice.dto.StoreDetailResponse;
import com.chanseok.restaurantservice.dto.CreateStoreRequest;
import com.chanseok.restaurantservice.service.StoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    @GetMapping
    public List<CreateStoreRequest> findStores() {
        return storeService.findAll();
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CreateStoreRequest storeDto) {
        storeService.save(storeDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{no}")
    public StoreDetailResponse findRestaurant(@PathVariable Long no) {
        return storeService.findByNo(no);
    }
}
