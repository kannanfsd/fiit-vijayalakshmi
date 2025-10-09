package com.learn.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    List<Integer> nums = Arrays.asList( 2, 4, 5, 7, 8, 9);
    List<Integer> withDup = Arrays.asList(1, 2, 2, 3, 4, 4);
    List<String> words = Arrays.asList("ibm", "gcp", "ibm", "cloud", "cloud", "ibm");

    public void findSecondLargest() {
        int sLarge = nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println("Second Largest: " + sLarge);
    }
    public void removeDuplicates() {
        List<Integer> dup = withDup.stream().distinct().collect(Collectors.toList());
        System.out.println("Removing Duplicates: " + dup);
    }
    public void joinStringWithComma() {
        String joined = words.stream().collect(Collectors.joining(","));
        System.out.println("Joined String: " + joined);
    }
    
    public static void main(String[] args) {
        StreamAPI streamAPI = new StreamAPI();
        streamAPI.findSecondLargest();
        streamAPI.removeDuplicates();
        streamAPI.joinStringWithComma();
    }
}
