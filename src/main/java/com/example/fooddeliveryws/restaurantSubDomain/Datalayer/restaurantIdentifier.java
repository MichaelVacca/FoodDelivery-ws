package com.example.fooddeliveryws.restaurantSubDomain.Datalayer;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.util.UUID;
@Embeddable
public class restaurantIdentifier {
    private String restaurantId;

    public restaurantIdentifier(){
        this.restaurantId = UUID.randomUUID().toString();
    }

    public String getRestaurantId() {
        return restaurantId;
    }


}
