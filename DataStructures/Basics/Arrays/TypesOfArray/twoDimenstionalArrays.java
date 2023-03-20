package DataStructures.Basics.Arrays.TypesOfArray;

// implementation of two dimensional arrays

public class twoDimenstionalArrays {
    
    public static void main(String[] args) {
        
        // declared a two dimensional arrays
        // initialized the value of array
        int[][] array = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};

        // print the 2d array
        // declared first the iteration value for the rows and cols to access its elements, since it is a 2d arrayt
        int rows;
        int cols;

        // loop through the 2d array
        for(rows = 0; rows < 5; rows++){
            for(cols = 0; cols < 5; cols++){
                System.out.print(array[rows][cols] + " ");
            }
            System.out.println();
        }

    }

}
