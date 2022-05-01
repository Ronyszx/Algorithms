package com.company;

public class LinearSearch {
    private static void LinearSearch(int[] arr, int item) {

        for(int i=0;i < arr.length;i++){
            if(arr[i] == item)
            {
                System.out.println(item + " Found at index : " + i);
                return;
            }
        }
        System.out.println("Not found");

    }

    public static void main(String args[]) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:")
            for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            }
        System.out.println("Array elements are:");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            }
        System.out.println("\nEnter a element to be searched:");

        int item = sc.nextInt();
        LinearSearch(arr, item);
    }
}
