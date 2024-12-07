package com.example.lifetail;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lifetail.model.Appointment;
import com.example.lifetail.model.Clinic;
import com.example.lifetail.model.Doctor;
import com.example.lifetail.model.Pet;
import com.example.lifetail.model.Schedule;
import com.example.lifetail.model.User;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    List<Appointment> appointments;
    RecyclerView AppointmentsRV;
    AppointmentAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prepareData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        AppointmentsRV = view.findViewById(R.id.frag_homeAppointmentsRV);
        adapter = new AppointmentAdapter(appointments);
        AppointmentsRV.setLayoutManager(new LinearLayoutManager(getContext()));
        AppointmentsRV.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }

    private void prepareData(){
        appointments = new ArrayList<>();
        User user = new User("U001", "John Doe", "john.doe@example.com", "+123456789", "hashedpassword", null, null);

        // Pet
        Pet pet = new Pet("P001", "Buddy", "Dog", "Labrador", LocalDate.of(2020, 5, 15), 20.0, "Vaccinated");

        // Clinic (updated constructor)
        Clinic clinic = new Clinic("C001", "Happy Pets Clinic", "123 Pet Street, Pet City", "+123456789", "clinic@example.com", 40.7128, -74.0060);

        // Doctor
        Doctor doctor = new Doctor("D001", "Dr. Sarah Smith", "dr.sarah@example.com", "+123456789", "Veterinarian", clinic, null, "http://example.com/profile.jpg");

        // Schedule
        Schedule schedule = new Schedule("S001", LocalDate.of(2024, 12, 7), LocalTime.of(9, 0), LocalTime.of(17, 0), 10);

        // Appointment
        Appointment appointment = new Appointment("A001", user, pet, doctor, clinic, schedule, "Follow-up check-up");

        Schedule scheduleTomorrow = new Schedule("S002", LocalDate.of(2024, 12, 8), LocalTime.of(10, 0), LocalTime.of(18, 0), 5);
        Appointment appointmentTomorrow = new Appointment("A002", user, pet, doctor, clinic, scheduleTomorrow, "Routine check-up");

        Schedule schedule2 = new Schedule("S002", LocalDate.of(2024, 12, 12), LocalTime.of(8, 0), LocalTime.of(12, 0), 5);
        Appointment appointment2= new Appointment("A002", user, pet, doctor, clinic, schedule2, "Check-up Vaccination");

        appointments.add(appointment);
        appointments.add(appointmentTomorrow);
        appointments.add(appointment2);
    }
}