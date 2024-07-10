package org.example.core;

public class IterationStatements {

    public static void main(String[] args) {
        int[] evenNumbers = {2, 4, 6, 8, 10};
        /*
        for(initialization, condition, increment/decrement){
        }
         */

        for (int i = 0; i < evenNumbers.length; i++) {
            //System.out.println(evenNumbers[i]);
        }
        /*
        //foreach
        for(variable : list/array){
        }
         */

        for (int num : evenNumbers) {
            //System.out.println(num);
        }

        int[] oddNumbers = {2, 4, 6, 8, 10};
        /*
        initialization
        while(condition){
          statements
          increment/decrement
        }
         */

        int x = 0;
        while (x < oddNumbers.length) {
            //System.out.println(oddNumbers[x]);
            x++;
        }

        /*
             initialization
             do{
              statements
             } while (condition)
         */

        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 10};
        int z = 0;
        do {
            System.out.println(numbers[z]);
            do {
                System.out.println(numbers[z]);
                z++;
            } while (numbers[z] % 2 == 0);

        } while (z < numbers.length);
    }
}
