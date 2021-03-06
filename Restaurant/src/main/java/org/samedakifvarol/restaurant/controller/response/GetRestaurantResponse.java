package org.samedakifvarol.restaurant.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.samedakifvarol.restaurant.model.dto.MenuDto;
import org.samedakifvarol.restaurant.model.entity.MenuEntity;
import org.samedakifvarol.restaurant.model.entity.RestaurantEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetRestaurantResponse {

    private String name;
    private String city;
    private String district;
    private String item;
    private String restaurantId;
    private MenuDto menu;

    public GetRestaurantResponse(RestaurantEntity restaurantEntity) {
        this.name=restaurantEntity.getName();
        this.city=restaurantEntity.getCity();
        this.district=restaurantEntity.getDistrict();
        this.item=restaurantEntity.getItem();
        this.restaurantId=restaurantEntity.getRestaurantId();
    }
}
