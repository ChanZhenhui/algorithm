package com.chan.sort;

public class SelectSort {

    public static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minIndex = j;
                    minValue = arr[j];
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = minValue;
        }
        return arr;
    }
}
