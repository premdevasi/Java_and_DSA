package arrays_and_arrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Input {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //arrays of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 232;
        arr[3] = 74;
        arr[4] = 626;
       // System.out.println(arr[3]);

        //input using foor loop 
        // for(int i=1;i<arr.length;i++){
        //  arr[i] = in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));//esme aray ko pura string me convert karke dega output = [23, 1, 5, 5, 4]
        //for(int i=1;i<arr.length;i++){
        //    System.out.print(arr[i]+" ");
        // }

        // for(int num:arr){//for every element in array, print the element, this loop konow as a for Each loop 
        //     System.out.print(num+" ");//here num represent element of array
        // }

        //array of objects
        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
         str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "prem";
    }

}
