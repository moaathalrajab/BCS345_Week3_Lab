
package com.mycompany.week3_lec2;

public class NewClass {
    
    // Lab3 Task1: Create a method that takes a String and returns how many
    // characters are there.
    // Call this method and pass your name as an argument. 
    
    int getStrLngth(String name){
        int l= name.length();
        return l;
    }
    
     // Lab3 Task2: Create a method that takes an integer array and return the sum 
     // of the elements 

    int getArraySum(int[] arr){
        int sm=0;
        for(int i=0; i<arr.length; i++)
            sm+=arr[i];
        return sm;
    }
    
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        int[] b={3,6,7,1};
        String str= "Moaath Alrajab";
        int z= nc.getStrLngth(str);
        int z1= nc.getArraySum(b);
        System.out.println("The array sum is  "+ z1);   
    }
}
