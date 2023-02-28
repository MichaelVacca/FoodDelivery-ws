package com.example.fooddeliveryws.restaurantSubDomain.datamapperlayer;

import com.example.fooddeliveryws.restaurantSubDomain.Datalayer.Address;
import com.example.fooddeliveryws.restaurantSubDomain.Datalayer.Restaurant;
import com.example.fooddeliveryws.restaurantSubDomain.Presentationlayer.RestaurantRequestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RestaurantRequestMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "restaurantIdentifier", ignore = true)
    Restaurant requestModelToEntity(RestaurantRequestModel requestModel);

    @Mapping(target = "countryName", source = "countryName")
    @Mapping(target = "streetName", source = "streetName")
    @Mapping(target = "cityName", source = "cityName")
    @Mapping(target = "provinceName", source = "provinceName")
    @Mapping(target = "postalCode", source = "postalCode")
    Address requestModelToAddress(RestaurantRequestModel requestModel);

}
