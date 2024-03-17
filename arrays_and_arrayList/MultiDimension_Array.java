package arrays_and_arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * this type array coled multiDimension(2D array).
         */
        // int [][] arr = new int[4][4];

        // int[][] arr = {//we can also ainitials like this
        // {1,2,3},
        // {4,5,6},
        // {7,8,9}
        // };

        // cloum is not naccsrey to defind
        // int [][] arr = new int[3][];
        // int[][] arr2D = {
        // {1,2,3},
        // {4,5},
        // {6,7,8, 9}
        // };

        int[][] arr = new int[3][3];
        //System.out.println(arr.length);// output = 3 because row is 3 then is also three

        //input
        for (int row = 0; row < arr.length; row++) {
            // for each cloum in ever row
            for (int col = 0; col < arr[row].length; col++) {// arr[row].length eska matalb he row ke andar har ek array  ki lenght
                                                            
                arr[row][col] = sc.nextInt();
            }
        }

        //output
        // for (int row = 0; row < arr.length; row++) {
        //     // for each cloum in ever row
        //     for (int col = 0; col < arr[row].length; col++) {// arr[row].length eska matalb he row ke andar har ek array  ki lenght
        //            System.out.print(arr[row][col] + " ");                                          
        //     }
        //     System.out.println();
        // }

        //Another Way to output
        // for (int row = 0; row < arr.length; row++) {
        //    System.out.println(Arrays.toString(arr[row]));
        // }
    
         //inhenc for loop for output
         for(int[] a:arr){//arr jo he vo outside vala array he or hamne int[] esliye likha koyki arr(outside array) ke andar bhi array hi to arr ke andat jo arr unke upat travel karna he
            System.out.println(Arrays.toString(a));
         }
    }

}
