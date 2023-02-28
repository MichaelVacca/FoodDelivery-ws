package com.example.fooddeliveryws.restaurantSubDomain.Datalayer;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class itemIdentifier {
    private String itemId;

    public itemIdentifier(){

        this.itemId = UUID.randomUUID().toString();
    }

    public String getItemId() {

        return itemId;
    }
}
