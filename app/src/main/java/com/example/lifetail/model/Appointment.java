package com.example.lifetail.model;

public class Appointment {
    private String appointmentID;
    private User user;
    private Pet pet;
    private Doctor doctor;
    private Clinic clinic;
    private Schedule schedule;
    private String notes;

    // Constructor
    public Appointment(String appointmentID, User user, Pet pet, Doctor doctor, Clinic clinic, Schedule schedule, String notes) {
        this.appointmentID = appointmentID;
        this.user = user;
        this.pet = pet;
        this.doctor = doctor;
        this.clinic = clinic;
        this.schedule = schedule;
        this.notes = notes;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
