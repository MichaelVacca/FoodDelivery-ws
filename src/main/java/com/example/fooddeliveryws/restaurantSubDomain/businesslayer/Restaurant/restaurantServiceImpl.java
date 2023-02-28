package com.example.fooddeliveryws.restaurantSubDomain.businesslayer.Restaurant;

import com.example.fooddeliveryws.restaurantSubDomain.Datalayer.Restaurant;
import com.example.fooddeliveryws.restaurantSubDomain.Datalayer.RestaurantRepository;
import com.example.fooddeliveryws.restaurantSubDomain.Presentationlayer.RestaurantResponseModel;
import com.example.fooddeliveryws.restaurantSubDomain.datamapperlayer.RestaurantRequestMapper;
import com.example.fooddeliveryws.restaurantSubDomain.datamapperlayer.RestaurantResponseMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class restaurantServiceImpl implements restaurantService {
    private RestaurantRepository restaurantRepository;
    private RestaurantResponseMapper restaurantResponseMapper;
    private RestaurantRequestMapper restaurantRequestMapper;

    public restaurantServiceImpl(RestaurantRepository restaurantRepository, RestaurantResponseMapper restaurantResponseMapper /*RestaurantRequestMapper restaurantRequestMapper*/) {
        this.restaurantRepository = restaurantRepository;
        this.restaurantResponseMapper = restaurantResponseMapper;
        //this.restaurantRequestMapper = restaurantRequestMapper;
    }

    @Override
    public List<RestaurantResponseModel> getRestaurants() {
        return restaurantResponseMapper.entityToResponseModelList(restaurantRepository.findAll());
    }

    @Override
    public Restaurant getRestaurantsById(String restaurantId) {
        return restaurantRepository.findByRestaurantIdentifier_RestaurantId(restaurantId);
    }

    @Override
    public Restaurant addRestaurant(Restaurant newRestaurant) {
        return restaurantRepository.save(newRestaurant);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant, String restaurantId) {
        Restaurant existingRestaurant = restaurantRepository.findByRestaurantIdentifier_RestaurantId(restaurantId);

        if(existingRestaurant == null){
            return null;
        }

        restaurant.setId(existingRestaurant.getId());
        restaurant.setRestaurantIdentifier( existingRestaurant.getRestaurantIdentifier());

        return restaurantRepository.save(restaurant);

    }

    @Override
    public void deleteRestaurant(String restaurantId) {
        //check if the restaurant to be deleted exists
        Restaurant existingRestaurant = restaurantRepository.findByRestaurantIdentifier_RestaurantId(restaurantId);

        if(existingRestaurant == null){
            return ;
        }
        restaurantRepository.delete(existingRestaurant);

    }

}
