package com.chan.sort;

public class InsertSort {

    /**
     * 插入排序，前面有序，后面无序，将无序的插入到有序序列当中
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        int insertVal;
        int insertIndex;
        for (int i = 1; i < arr.length; i++) {
            insertVal = arr[i];
            insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex --;
            }
            arr[insertIndex + 1] = insertVal;
        }
    }
}
