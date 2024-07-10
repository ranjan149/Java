package org.example.core;

public class Practice {

    //create a method that returns sum of all even number from 2-d array.
    //initialize a variable that holds the sum value.
    //iterate an outer array
    //iterate an inner array
    //check if the number is even
    //add the number to the variable that holds the sum value
    //return the final value
    public static int sumOfEvenNumbers() {
        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int finalSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    finalSum += numbers[i][j];
                }
            }
        }
        return finalSum;
    }

    public static int sumOfEvenNumbersForEach() {
        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int finalSum = 0;
        for (int[] num : numbers) {
            for (int innerNum : num) {
                if (innerNum % 2 == 0) {
                    finalSum += innerNum;
                }
            }
        }
        return finalSum;
    }


}
