package arrays_and_arrayList;

import java.util.Arrays;

public class swap {
     public static void main(String[] args) {
        int[] arr = {1,3,23,8,9,41};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        //swap(arr, 1, 3);
       // System.out.println(Arrays.toString(arr));//output = [1, 8, 23, 3, 9, 41] index1 and index2 swaped
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
              //swap
              swap(arr, start, end);
              start++;
              end--;
        }
   }


  static void swap(int[] arr, int index1, int index2){
      int temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
  }
}
