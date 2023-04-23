package com.example.restaurent.repository;

import com.example.restaurent.service.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDao {
    private List<Restaurant> restaurantList;
    public RestaurantDao(){
        restaurantList = new ArrayList<>();
        //Dummy Adding for testing purpose...
        restaurantList.add(new Restaurant("01", "kfc", "veg", "up", 22));
    }

    public List<Restaurant> getAllRestaurantFromRepository(){
        return restaurantList;
    }

    public boolean save(Restaurant restaurant){
        restaurantList.add(restaurant);
        return true;
    }

    public boolean remove(Restaurant restaurant){
        restaurantList.remove(restaurant);
        return true;
    }
    public boolean update(String id, String status){
        boolean updateStatus = false;
        for(Restaurant restaurant: restaurantList){
            if(restaurant.getId().equals(id)){
                remove(restaurant);
                restaurant.setName(status);
                save(restaurant);
                return true;
            }

        }
        return false;
    }
}
