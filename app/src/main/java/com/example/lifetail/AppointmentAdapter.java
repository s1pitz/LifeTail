package com.example.lifetail;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lifetail.model.Appointment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class AppointmentAdapter extends RecyclerView.Adapter<AppointmentAdapter.AppointmentHolder> {

    Context activityContext;

    List<Appointment> appointmentList;

    public AppointmentAdapter(List<Appointment> Appointments) {
        appointmentList = Appointments;
    }

    @NonNull
    @Override

    public AppointmentAdapter.AppointmentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        activityContext = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(activityContext);

        View layoutView = inflater.inflate(R.layout.rv_item_appointment, parent, false);
        AppointmentHolder holder = new AppointmentHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AppointmentAdapter.AppointmentHolder holder, int position) {

        if (appointmentList.isEmpty()) {
            return; // If the list is empty, do nothing
        }

        String name = appointmentList.get(position).getDoctor().getName();
        String specialization = appointmentList.get(position).getDoctor().getSpecialty();
        String petName = appointmentList.get(position).getPet().getName();
        String clinicName = appointmentList.get(position).getClinic().getName();
        LocalDate date = appointmentList.get(position).getSchedule().getDate();
        String day = appointmentList.get(position).getSchedule().getDay();
        int age = appointmentList.get(position).getPet().getAge();
        String scheduleText = appointmentList.get(position).getSchedule().getScheduleText();

        holder.itemNameTV.setText(name);
        holder.itemSpecializeTV.setText(specialization);
        holder.itemPetTV.setText(String.format("Appointment for %s (%d),", petName, age));
        holder.itemClinicTV.setText(String.format("at %s,", clinicName));
        holder.itemDateTV.setText(day);
        holder.itemScheduleTV.setText(scheduleText);

        if (date.equals(LocalDate.now())) {

            holder.itemContainerCL.setBackground(activityContext.getResources().getDrawable(R.drawable.bg_appointment_item_today));
            holder.itemDateTV.setTextColor(activityContext.getResources().getColor(R.color.green));
        } else if (date.equals(LocalDate.now().plusDays(1))) {

            holder.itemContainerCL.setBackground(activityContext.getResources().getDrawable(R.drawable.bg_appointment_item_tomorrow));
            holder.itemDateTV.setTextColor(activityContext.getResources().getColor(R.color.brown));

        }
        else {
            holder.itemContainerCL.setBackground(activityContext.getResources().getDrawable(R.drawable.bg_appointment_item_else));
        }
    }

    @Override
    public int getItemCount() {
        return appointmentList.size();
    }

    public class AppointmentHolder extends RecyclerView.ViewHolder{
        TextView itemNameTV, itemSpecializeTV, itemPetTV, itemClinicTV, itemDateTV, itemScheduleTV;
        ConstraintLayout itemContainerCL;

        public AppointmentHolder(@NonNull View itemView) {
            super(itemView);
            itemNameTV = itemView.findViewById(R.id.appointmentItem_NameTV);
            itemSpecializeTV = itemView.findViewById(R.id.appointmentItem_SpecializedTV);
            itemPetTV = itemView.findViewById(R.id.appointmentItem_PetnameTV);
            itemClinicTV = itemView.findViewById(R.id.appointmentItem_ClinicNameTV);
            itemDateTV = itemView.findViewById(R.id.appointmentItem_DayTV);
            itemScheduleTV = itemView.findViewById(R.id.appointmentItem_ScheduleTV);
            itemContainerCL = itemView.findViewById(R.id.appointmentItem_ContainerCL);
        }
    }
}
