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
    static int[] arrayPop(int[] theArray){
        int[] arrayDelete = new int[theArray.length-1];
        for (int i = 0; i< arrayDelete.length; i++){
            arrayDelete[i] = theArray[i];
        }
        return arrayDelete;
    }
    static int[] arrayInsert(int[] theArray, int index, int insertV){
        int[] arrayInsert = new int[theArray.length+1];

        for(int i = 0; i< index; i++){
            arrayInsert[i] = theArray[i];

        }
        arrayInsert[index] = insertV;
        for (int i = index+1; i< arrayInsert.length; i++){
            arrayInsert[i] = theArray[i-1];
        }
        return arrayInsert;
    }
    public static void main(String[] args) {

        int[] numArray1 = new int[5];
        for (int i = 0; i<numArray1.length; i++){
            numArray1[i] = i;
        }
        System.out.println("Default: " + Arrays.toString(numArray1));
        numArray1 = arrayAppend(numArray1, 2);
        System.out.println("Add: "+ Arrays.toString(numArray1));
        numArray1 = arrayPop(numArray1);
        System.out.println("Pop: " + Arrays.toString(numArray1));
        numArray1 = arrayInsert(numArray1, 3 ,9);
        System.out.println("Insert: " + Arrays.toString(numArray1));

    }
}
