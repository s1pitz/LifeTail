package com.example.lifetail.model;

import java.time.LocalDate;
import java.time.Period;

public class Pet {

    private String petID;
    private String name;
    private String species;
    private String breed;
    private LocalDate dateOfBirth;
    private double weight;
    private String medicalDetails;

    public Pet(String petID, String name, String species, String breed, LocalDate dateOfBirth, double weight, String medicalDetails) {
        this.petID = petID;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.medicalDetails = medicalDetails;
    }

    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
        this.petID = petID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMedicalDetails() {
        return medicalDetails;
    }

    public int getAge(){
        if (dateOfBirth == null) {
            throw new IllegalStateException("Date of birth is incorrect.");
        }
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
    public void setMedicalDetails(String medicalDetails) {
        this.medicalDetails = medicalDetails;
    }
}
