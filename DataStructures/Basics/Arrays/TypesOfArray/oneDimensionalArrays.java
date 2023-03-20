package DataStructures.Basics.Arrays.TypesOfArray;
import java.util.Arrays;

// implementation of one dimensional arrays

public class oneDimensionalArrays {
    
    public static void main(String[] args) {
        
        // declared an array of integers, you can declared any data types you want
        int[] array;

        // declared a allocated memory for the array
        // we allocate a 5 integers for the array
        array = new int[5];

        // initialize the first elements of the array
        array[0] = 100;

        // intializae the second element of the array
        array[1] = 200;

        // so on...
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;

        // print the array
        System.out.print("Print the array: " + Arrays.toString(array));
        System.out.println("");

        // print the array with their indices or index
        // we will use for loop to iterate over the array
        for(int i = 0; i < array.length; i++){
            System.out.println("Index " + i + " = " + array[i]);
        }


    }

}
