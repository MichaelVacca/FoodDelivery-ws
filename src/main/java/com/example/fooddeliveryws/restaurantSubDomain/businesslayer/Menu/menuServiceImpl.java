package com.example.fooddeliveryws.restaurantSubDomain.businesslayer.Menu;

import com.example.fooddeliveryws.restaurantSubDomain.Datalayer.Menu;
import com.example.fooddeliveryws.restaurantSubDomain.Datalayer.MenuRepository;
import com.example.fooddeliveryws.restaurantSubDomain.Presentationlayer.MenuResponseModel;
import com.example.fooddeliveryws.restaurantSubDomain.datamapperlayer.MenuResponseMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class menuServiceImpl implements menuService{

    private MenuRepository menuRepository;
    private MenuResponseMapper menuResponseMapper;

    public menuServiceImpl(MenuRepository menuRepository, MenuResponseMapper menuResponseMapper) {
        this.menuRepository = menuRepository;
        this.menuResponseMapper = menuResponseMapper;
    }

    @Override
    public List<MenuResponseModel> getAllMenus() {
        return menuResponseMapper.entityToResponseModelList(menuRepository.findAll());
    }

    @Override
    public Menu getMenusById(String menuId) {
        return menuRepository.findByMenuIdentifier_MenuId(menuId);

    }
}
