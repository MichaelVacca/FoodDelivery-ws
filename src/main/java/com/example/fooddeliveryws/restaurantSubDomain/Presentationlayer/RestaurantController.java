package com.example.fooddeliveryws.restaurantSubDomain.Presentationlayer;

import com.example.fooddeliveryws.restaurantSubDomain.Datalayer.Restaurant;
import com.example.fooddeliveryws.restaurantSubDomain.businesslayer.Restaurant.restaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/restaurants")
public class RestaurantController {

    private restaurantService restaurantService;

    public RestaurantController(com.example.fooddeliveryws.restaurantSubDomain.businesslayer.Restaurant.restaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    public List<RestaurantResponseModel> getRestaurants(){
        return restaurantService.getRestaurants();
    }

    @GetMapping("/{restaurantId}")
    public Restaurant getRestaurantsByRestaurantid(@PathVariable String restaurantId){
        return restaurantService.getRestaurantsById(restaurantId);

    }
    @PostMapping()
    public Restaurant addRestaurant(@RequestBody Restaurant newRestaurant){
        return restaurantService.addRestaurant(newRestaurant);
    }

    @PutMapping("/{restaurantId}")
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant, @PathVariable String restaurantId){
        return restaurantService.updateRestaurant(restaurant, restaurantId);
    }

    @DeleteMapping("/{restaurantId}")
    public void deleteRestaurant(@PathVariable String restaurantId){
        restaurantService.deleteRestaurant(restaurantId);
    }


}
