package com.chanseok.restaurantservice.service;

import com.chanseok.restaurantservice.dto.RestaurantDto;
import com.chanseok.restaurantservice.entity.Restaurant;
import com.chanseok.restaurantservice.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public List<RestaurantDto> findAll() {
        return restaurantRepository.findAll()
                .stream().map(entity -> RestaurantDto.of(entity)).collect(Collectors.toList());
    }

    public void save(RestaurantDto restaurantDto) {
        restaurantRepository.save(new Restaurant(restaurantDto.getName(), restaurantDto.getLocation(), restaurantDto.getLocationDetail()));
    }

    public RestaurantDto findByNo(Long no) {
        Restaurant restaurant = restaurantRepository.findByNo(no).orElseThrow(() -> new IllegalArgumentException("에러 발생"));
        return RestaurantDto.of(restaurant);
    }
}
