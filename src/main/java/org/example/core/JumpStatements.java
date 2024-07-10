package org.example.core;

public class JumpStatements {

    private static String hello;
    private static String world;

    public static void main(String[] args) {
        hello = "Hello";
    }

    public static int getMeFour(){
        int[] evenNumbers = {2,4,6,8,10};
        for (int i = 0; i < evenNumbers.length; i++) {
            if(evenNumbers[i] == 4){
               continue;
            }
            System.out.println(evenNumbers[i]);
        }
        System.out.println("I am out of loop");
        return 0;
    }

    //helper or utilities
}
