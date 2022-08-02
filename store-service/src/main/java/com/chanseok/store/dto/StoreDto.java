package com.chanseok.store.dto;

import com.chanseok.store.entity.Store;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.sql.Time;
import java.util.List;

public abstract class StoreDto {

    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public static class Request {

        @NotEmpty(message = "가게명은 필수 값 입니다.")
        private String name;

        @NotEmpty(message = "주소는 필수 값 입니다.")
        private String location;

        @NotEmpty(message = "주소 상세는 필수 값 입니다.")
        private String locationDetail;

        @NotEmpty(message = "영업 시작일을 입력해주세요.")
        private Time startBusinessTime;

        @NotEmpty(message = "영업 종료일을 입력해주세요.")
        private Time endBusinessTime;

        public Store toEntity() {
            return Store.builder()
                    .name(this.name)
                    .location(this.location)
                    .locationDetail(this.locationDetail)
                    .startBusinessTime(this.startBusinessTime)
                    .endBusinessTime(this.endBusinessTime)
                    .build();
        }
    }

    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public static class Response {
        private String name;
        private String location;
        private String locationDetail;
        private Time startBusinessTime;
        private Time endBusinessTime;

        public Response(Store store) {
            this.name = store.getName();
            this.location = store.getLocation();
            this.locationDetail = store.getLocationDetail();
            this.startBusinessTime = store.getStartBusinessTime();
            this.endBusinessTime = store.getEndBusinessTime();
        }
    }

    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public static class DetailResponse {
        private Long storeNo;
        private String restaurantName;
        private List<MenuDto> menus;

        public static DetailResponse of(Long storeNo, String restaurantName, List<MenuDto> menus) {
            return new DetailResponse(storeNo, restaurantName, menus);
        }
    }
}
