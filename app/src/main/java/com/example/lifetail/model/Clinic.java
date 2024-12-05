package com.example.lifetail.model;

public class Clinic {

    private String clinicID, name, location, phone, email;

    private Double latitude, longitude;

    public Clinic(String clinicID, String name, String location, String phone, String email, Double latitude, Double longitude) {
        this.clinicID = clinicID;
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getClinicID() {
        return clinicID;
    }

    public void setClinicID(String clinicID) {
        this.clinicID = clinicID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
