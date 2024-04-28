public class EvenDigits {

    public static void main(String[] args) {
      int nums[] = {12,345,2,6,7896};
      //System.out.println(FintdNumbers(nums));
     //System.out.println(digit(1));
    }

    // leetcode problem - 1295
    static int FintdNumbers(int[] nums) {
        int count = 0;
       for (int num : nums) {
        if(even(num)){
            count++;
        }
       }
        return count;
    }

    static boolean even(int num){
     int numOfDigit = digit(num);
     if(numOfDigit % 2 == 0){
        return true;
     }
     return false;
    }
    

    static int digit(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }

}
