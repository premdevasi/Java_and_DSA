
public class linear_search {

    public static void main(String[] args) {
        int arr[] = { 10, 12, 87, 48, 75, 51 };
        int ans =  linearSearch(arr, 48);
        System.out.println(ans);
    }

    // search in the array: return the index if the item found
    // otherwise if item not found return -1
    static int linearSearch(int arr[], int key) {
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        } 
        return -1;
    }

    //return element 
    static int linearSearch2(int arr[], int key) {
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return arr[i];
            }

        } 
        return -1;
    }
}
