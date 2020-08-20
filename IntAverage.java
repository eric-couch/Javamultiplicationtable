package com.company;

import org.w3c.dom.ls.LSOutput;

public class IntAverage {
    // A Given an array of integers, find the largest, smallest, and average
    // int[] nums = { 5, 17, 24, 5, 8, -3, 28 }
    // largest = 28, smallest = -3, average = 13.4
    // int[] nums { 2, 4, 6 }
    // largest = 6, smallest = 2, average = 4
    public static void main(String[] args) {
        int[] nums = { 5, 17, 24, 5, 8, -3, 28, 59, -10 };
        int min = nums[0];
        int max = nums[0];
        int sum = 0;

        for (int i = 0; i<nums.length; i++){
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
            sum += nums[i];
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
        System.out.println("age= " + (double)sum/(double)nums.length);

    }


}
