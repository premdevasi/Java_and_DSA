public class search_in_range {
    
    public static void main(String[] args) {
        int[] arr  = {18,12,-7,3,14,28};
        System.out.println(searchInRange(arr, 3, 1, 4));
    }
    static int searchInRange(int[] arr, int key,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i=start;i<=end;i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
