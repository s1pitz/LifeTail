package com.example.lifetail.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Schedule {

    private String scheduleID;
    private LocalDate date;
    private LocalTime startTime, endTime;
    private int slot;

    public Schedule(String scheduleID, LocalDate date, LocalTime startTime, LocalTime endTime, int slot) {
        this.scheduleID = scheduleID;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.slot = slot;
    }

    public String getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public String getDay(){
        if (date.equals(LocalDate.now())) {
            return "Today";
        } else if (date.equals(LocalDate.now().plusDays(1))) {
            return "Tomorrow";
        } else {
            return date.getDayOfWeek().toString();
        }
    }

    public String getScheduleText() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        String startFormatted = startTime.format(timeFormatter);
        String endFormatted = endTime.format(timeFormatter);

        if (date.equals(LocalDate.now())) {
            return ", from " + startFormatted + " to " + endFormatted;
        } else if (date.equals(LocalDate.now().plusDays(1))) {
            return ", from " + startFormatted + " to " + endFormatted;
        } else {
            return ", " + date.format(dateFormatter) + ", " + startFormatted + " - " + endFormatted;
        }
    }
}
