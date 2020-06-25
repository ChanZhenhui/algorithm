package com.chan.sort;

import java.util.Arrays;

/**
 * 希尔排序，插入排序优化
 */
public class ShellSort {

    /**
     *
     * 交换式  后期交换次数过多，很慢
     *
     * @param arr
     */
    public static void shellSort(int[] arr) {
        //分组
        int tmp;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        tmp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = tmp;
                    }
                }
            }
        }
    }

    /**
     * 位移法 快很多
     * 步长数组长度除以2，
     *
     * @param arr
     */
    public static void shellSort2(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int tmp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && tmp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = tmp;
                }
            }
        }
    }
}
