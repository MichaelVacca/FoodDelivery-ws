package com.example.fooddeliveryws.restaurantSubDomain.Datalayer;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="menus")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Embedded
    private restaurantIdentifier restaurantIdentifier;
    @Embedded
    private menuIdentifier menuIdentifier;
    private String typeOfMenu;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;


    public Menu() {
        this.restaurantIdentifier = new restaurantIdentifier();
        this.menuIdentifier = new menuIdentifier();
    }

    public Menu(com.example.fooddeliveryws.restaurantSubDomain.Datalayer.restaurantIdentifier restaurantIdentifier, com.example.fooddeliveryws.restaurantSubDomain.Datalayer.menuIdentifier menuIdentifier, String typeOfMenu) {
        this.restaurantIdentifier = restaurantIdentifier;
        this.menuIdentifier = menuIdentifier;
        this.typeOfMenu = typeOfMenu;
    }
}
