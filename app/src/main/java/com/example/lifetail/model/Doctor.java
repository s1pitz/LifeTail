package com.example.lifetail.model;

import java.util.List;

public class Doctor {
    private String doctorID;
    private String name;
    private String email;
    private String phone;
    private String specialty;        // Specialty (e.g., Veterinarian, Surgeon)
    private Clinic workClinic;
    private List<Schedule> schedules;
    private String profilePicture;

    public Doctor(String doctorID, String name, String email, String phone, String specialty, Clinic workClinic, List<Schedule> schedules, String profilePicture) {
        this.doctorID = doctorID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.specialty = specialty;
        this.workClinic = workClinic;
        this.schedules = schedules;
        this.profilePicture = profilePicture;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Clinic getWorkClinic() {
        return workClinic;
    }

    public void setWorkClinic(Clinic workClinic) {
        this.workClinic = workClinic;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }
}
