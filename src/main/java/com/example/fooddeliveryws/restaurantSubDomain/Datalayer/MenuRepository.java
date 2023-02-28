package com.example.fooddeliveryws.restaurantSubDomain.Datalayer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

    Menu findByMenuIdentifier_MenuId(String menuId);

}
