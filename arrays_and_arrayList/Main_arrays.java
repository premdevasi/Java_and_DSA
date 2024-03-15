package arrays_and_arrayList;

public class Main_arrays {
    
    public static void main(String[] args) {
        //Q store a presn's roll Number
       int roll  = 7;

       //store name 
       String name = "prem";

    int num1 = 4;
    int num2 = 45;
    int num3  = 78;
    //we cant store roll like this when someone says that sote 500 roll number thts we can store roll number in array
    //Array is a coltion of datatypes whatwere datatypes are we can store like boolean,string and object

    //syntax
    int[] rons = new int[5];
    //or we can anisilaize dircaly
    int[] rons1 = {45,5,1,51,54};
    //all the data in array well be same type like if data type anisilaize as an int[] = {5,7,5,"prem"(this is String we cant use string in int type)}
    int[] ros ;// declaration of array. ros is gatting defind in stack
    ros = new int[5];//initialsation of an array when we use new key world imgen that a object created in heap memory
    //System.out.println(ros[1]);//out put will be zero because intarnally intizar type 5 size then will be look like this={0, 0, 0, 0, 0}

    String[] arr = new String[4];
    System.out.println(arr[1]);//String me output null aayega koyoki uske under koi datatype he nhi
    }
}
