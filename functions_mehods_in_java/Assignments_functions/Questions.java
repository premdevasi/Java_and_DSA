package functions_mehods_in_java.Assignments_functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        // for(int i=100;i<=999;i++){
        // if(isArmstrong(i)){
        // System.out.print(i+" ");
        // }
        // }
    }

    // Prime Number
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c + c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        if (c + c > n) {
            return true;
        }
        return false;
    }

    // Armstrong number
    static boolean isArmstrong(int n) {
        int originalnum = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == originalnum;
    }

}
