package com.example.fooddeliveryws.restaurantSubDomain.datamapperlayer;

import com.example.fooddeliveryws.restaurantSubDomain.Datalayer.Menu;
import com.example.fooddeliveryws.restaurantSubDomain.Datalayer.Restaurant;
import com.example.fooddeliveryws.restaurantSubDomain.Presentationlayer.MenuResponseModel;
import com.example.fooddeliveryws.restaurantSubDomain.Presentationlayer.RestaurantResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper(componentModel = "spring")
//@Component
public interface MenuResponseMapper {
    @Mapping(expression = "java(menu.getRestaurant().getRestaurantIdentifier().getRestaurantId())", target = "restaurantId")
    @Mapping(expression = "java(menu.getRestaurant().getMenuIdentifier().getMenuId())", target = "menuId")
    @Mapping(expression = "java(menu.getTypeOfMenu())", target = "typeOfMenu")

    MenuResponseModel entityToResponseModel(Menu menu);
    List<MenuResponseModel> entityToResponseModelList(List<Menu> menus);
}
