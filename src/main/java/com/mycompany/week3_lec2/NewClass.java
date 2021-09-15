
package com.mycompany.week3_lec2;

public class NewClass {
    
    // Lab3 Task: Create a method that takes a String and returns how many
    // characters are there.
    // Call this method and pass your name as an argument. 
    
    int getStrLngth(String name){
        int l= name.length();
        return l;
    }
    
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        String str= "Moaath Alrajab";
        int z= nc.getStrLngth(str);
        System.out.println("The length is "+ z);   
    }
}
