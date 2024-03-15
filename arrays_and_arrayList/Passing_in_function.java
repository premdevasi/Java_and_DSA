
 package arrays_and_arrayList;

import java.util.Arrays;

class Passing_in_function {

    public static void main(String[] args) {
        int[] num = {3,4,5,8};
        System.out.println(Arrays.toString(num));
        chamge(num);
        System.out.println(Arrays.toString(num));
    }

    static void chamge(int[] arr){
        arr[0] = 99;

    }
     
}