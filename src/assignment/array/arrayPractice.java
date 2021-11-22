package assignment.array;

import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {
        int[] numArray1 = new int[20];
        Integer[] numArray2 = new Integer[10];
        int numCount = 0;
        int numAverage =0;
        int swappingPosition1 = 1;
        int swappingPosition2 = 2;
        for(int i = 0; i<20; i++ ){
            int randNum1 = (int)(Math.random() * 6) + 1;
            numArray1[i] = randNum1;
           // System.out.println(numArray1[i]);
            if (numArray1[i]==1){
                numCount++;
            }
        }
        for(int i = 0; i<10; i++ ){
            int randNum1 = (int)(Math.random() * 100) + 1;
            numArray2[i] = randNum1;
            numAverage += numArray2[i];
        }
        System.out.println("First assignment.array: " + Arrays.toString(numArray1));
        System.out.println(numCount + " of 1 generated in this assignment.array");

        System.out.println("Second assignment.array: " + Arrays.toString(numArray2));

        int temp = numArray2[swappingPosition1];
        numArray2[swappingPosition1] = numArray2[swappingPosition2];
        numArray2[swappingPosition2] =temp;
        System.out.println("Swap: " + Arrays.toString(numArray2));
        int[] numArray2Reverse = new int[10];
        for (int i=0; i<10; i++){
            numArray2Reverse[i] = numArray2[9-i];
        }

        System.out.println("Reverse: " + Arrays.toString(numArray2Reverse));

        System.out.println("Average of the second assignment.array: " + numAverage/10);

    }
}
