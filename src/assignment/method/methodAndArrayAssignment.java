package assignment.method;

import java.util.Arrays;

public class methodAndArrayAssignment {
    static int[] arrayAppend(int[] theArray,int appendedValue ){
        int[] arrayAdd = new int[theArray.length+1];
        arrayAdd[theArray.length] = appendedValue;
        for(int i = 0; i< theArray.length; i++){
            arrayAdd[i] = theArray[i];
        }
        return arrayAdd;
    }
    static int[] arrayDelete(int[] theArray){
        int[] arrayDelete = new int[theArray.length-1];
        for (int i = 0; i< arrayDelete.length; i++){

        }
        return arrayDelete;
    }
    public static void main(String[] args) {

        int[] numArray1 = new int[1];
        numArray1[0] = 1;
        System.out.println(Arrays.toString(numArray1));
        numArray1 = arrayAppend(numArray1, 2);
        System.out.println(Arrays.toString(numArray1));

    }
}
