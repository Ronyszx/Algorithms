package com.company;

import com.sun.source.tree.BreakTree;

public class LinearSearch {


    // In linear search the big O at best case is O(1)  which means no matter the size of the array it is always going to be at  first element and time is constant
    // and in worst case the BIG O is O(N) the time will grow linearly as the size grows


    private static void LinearSearch(int[] arr, int item) {
        /*  Is nothing but the array is searching at every element in array */
        for(int i=0;i < arr.length;i++){
            if(arr[i] == item)
            {
                System.out.println(item + " Found at index : " + i);
                return ;
            }
        }
        System.out.println("Not found");

    }

   //For searching element in range
    static void LinerSearchInRange(int arr[], int start, int end, int target){
        for(int i = start; i <=end ; i++){
            if(arr[i] == target){
                System.out.println("element found");
                return ;
            }
        }
        System.out.println("Element not found");
    }

    // Printing the minimum number using Linear search
    static void minNum(int arr[]){
        int min = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println(min);
    }


    static void searchIn2DaArray(int arr1[][], int target){
        for(int i = 0; i < arr1.length; i++ ){
            for(int j = 0; j< arr1[i].length ; j++){
                if(arr1[i][j] == target){
                    System.out.println(arr1[i][j]+" -> Found");
                    return;
                }
            }
        }
        System.out.println("Not found");
    }

    //Linear search for String
    static void stringSearch(String s, char c){

        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == c){
                System.out.println("Char found: "+ s.charAt(i));
                return;
            }
        }
        System.out.println("CHAR NOT FOUND: "+ c);
    }

    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i =0 ; i<nums.length; i++){
            if(even(nums[i])%2 == 0)
                count++;
            }
        return count;
    }

    static int even(int num){
        return (int)Math.log10(num)+1;
    }

    //https://leetcode.com/problems/richest-customer-wealth/submissions/
    public int maximumWealth(int[][] accounts) {
        int sum2 =Integer.MIN_VALUE;
        for(int i = 0 ; i < accounts.length; i++){
            int sum1 =0;
            for(int j = 0 ; j < accounts[i].length; j++){
                sum1 += accounts[i][j];
            }
            if(sum1>sum2){
                sum2 = sum1;
            }
        }
        return sum2;
    }


    public static void main(String args[]) {
        int[] arr = {12, 5, 18, 25, -3, 19};
        int[][] arr1= {
                {1,2,3,21,32,43},
                {4,5,6},
                {7,8,9,11}
        }  ;
        int item = 9;

        String s = "HelloWorld";
        char c = 'p';
        //LinearSearch(arr, item);

       // LinerSearchInRange(arr, 2, 5, 12);
       // minNum(arr);

       // searchIn2DaArray(arr1, item);
        stringSearch(s,c);

    }
}
