package com.example.fooddeliveryws.restaurantSubDomain.Datalayer;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String restaurantName;

    @Embedded
    private menuIdentifier menuIdentifier;

    @Embedded
    private Address address;


@Embedded
    private restaurantIdentifier restaurantIdentifier;

    public Restaurant() {
        this.restaurantIdentifier = new restaurantIdentifier();
        this.menuIdentifier = new menuIdentifier();
    }

    public Restaurant(String restaurantName, com.example.fooddeliveryws.restaurantSubDomain.Datalayer.menuIdentifier menuIdentifier, Address address, com.example.fooddeliveryws.restaurantSubDomain.Datalayer.restaurantIdentifier restaurantIdentifier) {

        this.restaurantName = restaurantName;
        this.menuIdentifier = menuIdentifier;
        this.address = address;
        this.restaurantIdentifier = new restaurantIdentifier();
    }
}
