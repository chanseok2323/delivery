package com.chanseok.restaurantservice.service;

import com.chanseok.restaurantservice.dto.MenuDto;
import com.chanseok.restaurantservice.dto.RestaurantDetailResponse;
import com.chanseok.restaurantservice.dto.CreateRestaurantRequest;
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

    public List<CreateRestaurantRequest> findAll() {
        return restaurantRepository.findAll()
                .stream().map(entity -> CreateRestaurantRequest.of(entity)).collect(Collectors.toList());
    }

    public void save(CreateRestaurantRequest restaurantDto) {
        restaurantRepository.save(new Restaurant(restaurantDto.getName()
                , restaurantDto.getLocation()
                , restaurantDto.getLocationDetail()
                , restaurantDto.getStartBusinessTime()
                , restaurantDto.getEndBusinessTime())
        );
    }

    public RestaurantDetailResponse findByNo(Long no) {
        Restaurant restaurant = restaurantRepository.findByNo(no)
                .orElseThrow(() -> new IllegalArgumentException("에러 발생"));
        List<MenuDto> menus = restaurantRepository.findByRestaurantNo(no);
        return RestaurantDetailResponse.of(restaurant.getNo(), restaurant.getName(), menus);
    }
}
