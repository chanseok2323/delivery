package com.chanseok.restaurantservice.dto;

import com.chanseok.restaurantservice.entity.Store;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter @Setter
public class CreateStoreRequest {
    private String name;
    private String location;
    private String locationDetail;
    private Time startBusinessTime;
    private Time endBusinessTime;

    protected CreateStoreRequest() {
    }

    public CreateStoreRequest(String name, String location, String locationDetail, Time startBusinessTime, Time endBusinessTime) {
        this.name = name;
        this.location = location;
        this.locationDetail = locationDetail;
        this.startBusinessTime = startBusinessTime;
        this.endBusinessTime = endBusinessTime;
    }

  public static CreateStoreRequest of(Store store) {
        return new CreateStoreRequest(store.getName()
                , store.getLocation()
                , store.getLocationDetail()
                , store.getStartBusinessTime()
                , store.getEndBusinessTime()
        );
    }
}
