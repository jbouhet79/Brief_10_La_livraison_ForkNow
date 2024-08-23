
package fr.simplon.forknow.service;

import java.util.List;

import fr.simplon.forknow.dto.RegisterRestaurantDto;
import fr.simplon.forknow.model.Restaurant;

public interface RestaurantService {

    void saveRestaurant(RegisterRestaurantDto restaurantMapping);

    List<Restaurant> findAllRestaurants();

}
