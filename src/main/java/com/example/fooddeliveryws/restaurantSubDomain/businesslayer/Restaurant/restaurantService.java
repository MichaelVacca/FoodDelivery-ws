package com.example.fooddeliveryws.restaurantSubDomain.businesslayer.Restaurant;

import com.example.fooddeliveryws.restaurantSubDomain.Datalayer.Restaurant;
import com.example.fooddeliveryws.restaurantSubDomain.Presentationlayer.RestaurantRequestModel;
import com.example.fooddeliveryws.restaurantSubDomain.Presentationlayer.RestaurantResponseModel;

import java.util.List;

public interface restaurantService {

    //All Restaurant methods
    List<RestaurantResponseModel> getRestaurants();
    Restaurant getRestaurantsById(String restaurantId);
    //Restaurant addRestaurant(RestaurantRequestModel restaurantRequestModel);
    Restaurant addRestaurant(Restaurant newRestaurant);
    Restaurant updateRestaurant(Restaurant restaurant, String restaurantId);
    void deleteRestaurant(String restaurantId);



}
