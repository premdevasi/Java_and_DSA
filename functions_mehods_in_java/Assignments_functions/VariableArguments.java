package functions_mehods_in_java.Assignments_functions;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        // fun(2,3,4,5,6,56,47,88);
        multiple(2,3,"prem", "kunal", "Rhula");
    }

    static void multiple(int a, int b, String...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
