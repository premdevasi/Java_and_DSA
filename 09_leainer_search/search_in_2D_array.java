import java.util.Arrays;
public class search_in_2D_array {
  
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
    //     int[] ans = searchIn2DArray(arr, 34);
    //    System.out.println(Arrays.toString(ans));

    // find key and return true and false
    // System.out.println(searchIn2DArray(arr, 98));

    //max value
    //System.out.println(max(arr));

    //min  value in 2D array
    System.out.println(min(arr));
    }







//return kiya he hamne ek naya array jisme row or colum ho
    static int[] searchIn2DArray(int[][] arr,int key){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==key){
                  return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }


    //if key exist return true if not exiset return false
//     static boolean searchIn2DArray(int[][] arr,int key){
//         for(int row=0;row<arr.length;row++){
//             for(int col=0;col<arr[row].length;col++){
//                 if(arr[row][col]==key){
//                   return true;
//                 }
//             }
//         }
//         return false;
// }



//find maximum value in 2D array
static int max(int[][] arr){
    int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]>max){
             max= arr[i][j];
            }
        }
    }
    return max;
}


//min value in 2D array
static int min(int[][] arr){
    int min = arr[0][0];
    for(int i=1;i<arr.length;i++){
        for(int j=1;j<arr[i].length;j++){
            if(arr[i][j]<min){
             min= arr[i][j];
            }
        }
    }
    return min;
}

}
