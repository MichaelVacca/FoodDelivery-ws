package com.example.fooddeliveryws.restaurantSubDomain.businesslayer.Menu;

import com.example.fooddeliveryws.restaurantSubDomain.Datalayer.Menu;
import com.example.fooddeliveryws.restaurantSubDomain.Datalayer.Restaurant;
import com.example.fooddeliveryws.restaurantSubDomain.Presentationlayer.MenuResponseModel;

import java.util.List;

public interface menuService {
    List<MenuResponseModel> getAllMenus();
    Menu getMenusById(String menuId);
}
