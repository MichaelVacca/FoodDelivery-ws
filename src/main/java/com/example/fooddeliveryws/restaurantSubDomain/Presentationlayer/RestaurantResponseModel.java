package com.example.fooddeliveryws.restaurantSubDomain.Presentationlayer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RestaurantResponseModel {
    private final String restaurantId;
    private final String restaurantName;
    private final String countryName;
    private final String streetName;
    private final String provinceName;
    private final String cityName;
    private final String postalCode;
}
