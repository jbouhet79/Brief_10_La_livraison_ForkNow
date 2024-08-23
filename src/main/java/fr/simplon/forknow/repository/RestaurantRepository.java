package fr.simplon.forknow.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.simplon.forknow.model.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
        Optional<Restaurant> findByName(String name);

        List<Restaurant> findAllRestaurants();

        // Optional<Restaurant> findAllRestaurants();
    
} 