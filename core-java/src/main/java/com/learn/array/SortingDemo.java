package com.learn.array;

import java.util.Arrays;
import java.util.Random;

public class SortingDemo {
    public static void main(String[] args) {
        int[] smallArray = {5,2,8,1,6};
        System.out.println(Arrays.toString(smallArray));
        Arrays.sort(smallArray);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = new int[10000];
        Random random = new Random();

        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = random.nextInt(1000000);
        }
        System.out.println(Arrays.toString(largeArray));
        Arrays.parallelSort(largeArray);
        System.out.println(Arrays.toString(largeArray));
    }
}
