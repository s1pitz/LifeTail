package com.example.lifetail.helpers;

import java.util.Arrays;

public class StringUtils {
    public static String toTitleCaseDay(String dayOfWeek) {
        if (dayOfWeek == null || dayOfWeek.isEmpty()) {
            return dayOfWeek;
        }
        // Convert the day of the week to lowercase and capitalize the first letter
        return dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1).toLowerCase();
    }
}
