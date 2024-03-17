package arrays_and_arrayList;

public class max {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 8, 9, 41 };
        System.out.println(maxRange(arr, 1, 3));
    }

    static int max(int[] arr) {
        int maxVal = 0;
         for(int i=1;i<arr.length;i++){
       if(arr[i]>maxVal){
        maxVal = arr[i];
       }
 }
   
 return maxVal;
}
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
         for(int i=start;i<=end;i++){
       if(arr[i]>maxVal){
        maxVal = arr[i];
       }
 }
   
 return maxVal;
}
}
