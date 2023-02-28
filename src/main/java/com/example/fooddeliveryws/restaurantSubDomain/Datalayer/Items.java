package com.example.fooddeliveryws.restaurantSubDomain.Datalayer;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="items")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String itemName;
    private double itemPrice;

    private String itemDescription;

    @Embedded
    private menuIdentifier menuIdentifier;

    public Items() {
        this.menuIdentifier = new menuIdentifier();
    }

    public Items(String itemName, double itemPrice, String itemDescription, com.example.fooddeliveryws.restaurantSubDomain.Datalayer.menuIdentifier menuIdentifier) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.menuIdentifier = new menuIdentifier();
    }
}
