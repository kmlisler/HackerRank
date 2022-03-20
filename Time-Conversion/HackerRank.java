/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hackerrank;

/**
 *
 * @author kamil
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class HackerRank {

    /**
     * Given a time in 12-hour AM/PM format, convert it to military (24-hour)
     * time.
     *
     * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock. -
     * 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
     */
    public static String timeConversion(String s) {

        char am_or_pm = s.charAt(8);
        String hour = s.substring(0, 2);
        String time_without_hour = s.substring(2, 8);
        if (am_or_pm == 'P') { // this means PM

            int output_hour;
            if (hour.charAt(0) == '0') { // if hour is one digit number
                int new_hour = Character.getNumericValue(s.charAt(1));
                output_hour = new_hour + 12;

            } else if (hour.equals("12")) { // specific 
                return "12" + time_without_hour;
            } else { // 11 -> 23 , 5 -> 17
                output_hour = Integer.parseInt(hour) + 12;
            }
            return output_hour + time_without_hour;
        } else {
            if (hour.equals("12")) {
                return "00" + time_without_hour;
            } else {
                return hour + time_without_hour;
            }
        }
    }
}
