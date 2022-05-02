package com.company;

public class BinaryRecursive {
    public static int binarySearch(int arr[], int left, int right, int item){
        if(right>= left){
            int mid = left + (right -left)/2;
            if(arr[mid]== item){
                return mid+1;

            }
            if(arr[mid]>item){
                return binarySearch(arr, left, mid-1, item);
            }
            else

                return binarySearch(arr, mid+ 1 ,right, item );
        }else
            return -1;
    }


    public static void main(String args[]){

        int[ ] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int item = 70;
        int size = array.length;

        int position = binarySearch(array, 0, size-1, item);

        if(position == -1)
            System.out.println("Element not found");
        else
            System.out.println("The value " + item + " found at position: " + position);

    }
}
