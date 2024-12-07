package com.example.lifetail.model;

import java.util.List;

public class User {
    private String userID;
    private String name;
    private String email;
    private String phone;
    private String password;
    private List<Pet> pets;
    private List<Appointment> appointments;

    public User(String userID, String name, String email, String phone, String password, List<Pet> pets, List<Appointment> appointments) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.pets = pets;
        this.appointments = appointments;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
