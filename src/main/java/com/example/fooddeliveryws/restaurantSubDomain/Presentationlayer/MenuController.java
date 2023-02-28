package com.example.fooddeliveryws.restaurantSubDomain.Presentationlayer;

import com.example.fooddeliveryws.restaurantSubDomain.businesslayer.Menu.menuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/menus")
public class MenuController {
    private menuService menuService;

    public MenuController(menuService menuService) {
        this.menuService = menuService;
    }
}
