package org.samedakifvarol.restaurant.model;

import lombok.Data;

@Data
public class GetRestaurantResponseModel {

    private String name,city,district,menu,item,restaurantId;
}
