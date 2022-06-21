package com.chanseok.restaurantservice.web;

import com.chanseok.restaurantservice.dto.RestaurantDto;
import com.chanseok.restaurantservice.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/restaurant")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping
    public List<RestaurantDto> findRestaurants() {
        return restaurantService.findAll();
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody RestaurantDto restaurantDto) {
        restaurantService.save(restaurantDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{no}")
    public RestaurantDto findRestaurant(@PathVariable Long no) {
        return restaurantService.findByNo(no);
    }
}
