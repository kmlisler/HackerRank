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
     * Given five positive integers, find the minimum and maximum values that
     * can be calculated by summing exactly four of the five integers. Then
     * print the respective minimum and maximum values as a single line of two
     * space-separated long integers.
     */
    public static void miniMaxSum(List<Integer> arr) {

        long max = 0;
        double min = Double.POSITIVE_INFINITY;
        long sum_all = 0;
        for (int i = 0; i < arr.size(); i++) {

            sum_all += arr.get(i);

            if (arr.get(i) > max) {
                max = arr.get(i);
            }
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        // for max
        long max_sum = sum_all - (long) min;
        // for min
        long min_sum = sum_all - max;
        System.out.print(min_sum);
        System.out.print(' ');

        System.out.print(max_sum);

    }

}
