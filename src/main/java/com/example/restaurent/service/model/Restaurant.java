package com.example.restaurent.service.model;

public class Restaurant {
    private String id;
    private String name;
    private String specialization;
    private String Address;
    private int staff;

    public Restaurant(String id, String name, String specialization, String address, int staff) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        Address = address;
        this.staff = staff;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getStaff() {
        return staff;
    }

    public void setStaff(int staff) {
        this.staff = staff;
    }
}
