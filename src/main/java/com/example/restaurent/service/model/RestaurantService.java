package com.example.restaurent.service.model;

import com.example.restaurent.repository.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantDao restaurantDao;

    public List<Restaurant> getAllRestaurantFromService(){
        return restaurantDao.getAllRestaurantFromRepository();
    }
    public String addRestaurantInService(Restaurant restaurant){
        boolean insertion = restaurantDao.save(restaurant);
        if(insertion){
            return "Restaurant added succesfully!!!!!!";
        }
        else{
            return "failed!!!!!!.....Insertion not possible";
        }
    }
    public Restaurant getRestaurantByIdFromService(String id){
        List<Restaurant> currentRestaurant = restaurantDao.getAllRestaurantFromRepository();
        for(Restaurant restaurant: currentRestaurant){
            if(restaurant.getId().equals(id)){
                return restaurant;
            }
        }
        return null;

    }
    public String removeRestaurantById(String id){
        boolean deleteResponse = false;
        String status;
        if(id != null){
            List<Restaurant> currentRestaurant = restaurantDao.getAllRestaurantFromRepository();
            for(Restaurant restaurant: currentRestaurant){
                if(restaurant.getId().equals(id)){
                    deleteResponse = restaurantDao.remove(restaurant);
                    if(deleteResponse){
                        status = "restaurant with " + id + " was deleted...";
                    }
                    else{
                        status = "Restaurant with " + id + " was not possible deleted...";
                    }
                    return status;
                }
            }
            return "Restaurant with " + id + " does not exist";
        }
        else{
            return "Invalid id!!!... can not accept null Restaurant id";
        }
    }
    public String updateRestaurantById(String id, String status){

        boolean updateStatus = restaurantDao.update(id, status);
        if(updateStatus){
            return "Restaurant with " + id + " was updated...";
        }
        else{
            return "restaurant with " + id + " was not updated...";
        }


    }
}
