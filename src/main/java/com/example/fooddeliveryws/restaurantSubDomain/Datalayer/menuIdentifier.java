package com.example.fooddeliveryws.restaurantSubDomain.Datalayer;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class menuIdentifier {

    private String menuId;

    public menuIdentifier(){
        this.menuId = UUID.randomUUID().toString();
    }

    public String getMenuId() {
        return menuId;
    }
}
