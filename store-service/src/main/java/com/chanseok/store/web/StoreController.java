package com.chanseok.store.web;

import com.chanseok.store.dto.StoreDto;
import com.chanseok.store.service.StoreService;
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
    public List<StoreDto.Response> findStores() {
        return storeService.findAll();
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody StoreDto.Request storeDto) {
        storeService.save(storeDto.toEntity());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{no}")
    public StoreDto.DetailResponse findRestaurant(@PathVariable Long no) {
        return storeService.findByNo(no);
    }
}
