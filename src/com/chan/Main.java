package com.chan;

import com.chan.sort.SelectSort;


public class Main {
    private static final int ARR_SIZE = 100000;
    public static void main(String[] args) {
        int[] arr = getRandomArr(ARR_SIZE);
        long start = System.currentTimeMillis();
        SelectSort.selectSort(arr);
//        System.out.println(Arrays.toString(SelectSort.selectSort(arr)));
        System.out.println(System.currentTimeMillis() - start);

    }

    private static int[] getRandomArr(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }
        return arr;
    }
}
