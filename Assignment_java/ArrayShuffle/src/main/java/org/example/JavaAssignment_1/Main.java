package org.example.JavaAssignment_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        System.out.println("Enter the elements in tha array");
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
       ArrayShuffle arrayShuffle=new ArrayShuffle();
        int[] result=arrayShuffle.shuffleArray(arr);
        System.out.println("The shuffled array : ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}