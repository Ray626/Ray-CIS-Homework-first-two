package assignment.method;

import java.util.Arrays;

public class methodAndArrayAssignment {
    static int[] arrayAppend(int[] theArray,int appendedValue ){
        int[] arrayTwo = new int[theArray.length+1];
        arrayTwo[theArray.length] = appendedValue;
        for(int i=0; i< theArray.length; i++){
            arrayTwo[i] = theArray[i];
        }


        return arrayTwo;
    }
    public static void main(String[] args) {

        int[] numArray1 = new int[1];
        numArray1[0] = 1;
        System.out.println(Arrays.toString(numArray1));
        int[]array2 =  arrayAppend(numArray1, 2);
        System.out.println(Arrays.toString(array2));

    }
}
