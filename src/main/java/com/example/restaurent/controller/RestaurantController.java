package com.example.restaurent.controller;

import com.example.restaurent.service.model.Restaurant;
import com.example.restaurent.service.model.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    //Get all Restaurant by this endpoint
    @GetMapping(value = "/getAllRestaurant")
    public List<Restaurant> getAllUser(){
        return restaurantService.getAllRestaurantFromService();
    }
    //Add restaurants...
    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurantInService(restaurant);
    }
    //get restaurant by id..
    @RequestMapping(value = "/getRestaurantById/{id}", method = RequestMethod.GET)
    public Restaurant getRestaurantById(@PathVariable String id){
        return restaurantService.getRestaurantByIdFromService(id);
    }
    //Delete restaurant....
    @DeleteMapping(value = "/deleteRestaurantById/{id}")
    public String deleteRestaurantById(@PathVariable String id){
        return restaurantService.removeRestaurantById(id);
    }

    //update user

    @PutMapping(value = "/updateRestaurantById/{id}/{status}")
    public String updateRestaurantById(@PathVariable String id, @PathVariable String status){
        return restaurantService.updateRestaurantById(id, status);
    }



}
