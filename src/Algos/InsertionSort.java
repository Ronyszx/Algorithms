package com.company;

public class InsertionSort {
    static void insertionSort(int[] arr){
        int len = arr.length;
        for(int i=1; i<len; i++){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }
    static void printArray(int a[]){
        int len = a.length;
        for(int i =0;i<len; i++){
            System.out.println(a[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int a[] = {12, 4, 3, 53, 22 ,5 , 11, 33,2};
        System.out.println("Array before sorting:");
        printArray(a);

        insertionSort(a);

        System.out.println("Array after sorting");
        printArray(a);
    }
}
