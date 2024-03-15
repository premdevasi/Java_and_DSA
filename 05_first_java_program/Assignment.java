import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Q1. Write a program to print whether a number is even or odd, also take input
       // from the user.
        //answer =
        int num1 = in.nextInt();
        if(num1%2==0){
        System.out.println("number is even");
        }else{
        System.out.println("number is odd");
        }
        System.out.println(num1);

        // Q2.Take name as input and print a greeting message for that particular name.
        // answer =
        // String name = input.nextLine();
        // System.out.println(name +" gand mrao");

        // Q3.Write a program to input principal, time, and rate (P, T, R) from the user
        // and find Simple Interest.
        // answer =
        // System.out.println("Enter principal");
        // int P = in.nextInt();
        // System.out.println("Enter time");
        // int T = in.nextInt();
        // System.out.println("Enter rate");
        // int R = in.nextInt();

        // int SimpleInterest = (P*R*T)/100;
        // System.out.println("This your Simple Interest = " + SimpleInterest);

        // Q4.Take in two numbers and an operator (+, -, *, /) and calculate the value.
        // (Use if conditions)
        // answer =
        // int num1 = in.nextInt();
        // int num2 = in.nextInt();
        // int operator = in.nextInt();
        // int ans = 0;
        // if(operator == '+'){
        // ans = num1+num2;
        // }
        // if(operator == '-'){
        // ans = num1-num2;
        // }
        // if(operator == '*'){
        // ans = num1*num2;
        // }
        // if(operator == '/'){
        // ans = num1/num2;
        // }
        // System.out.println(ans);

        // Q5.Take 2 numbers as input and print the largest number.
        // answer =
        // int num1 = in.nextInt();
        // int num2 = in.nextInt();
        // if(num1>num2){
        // System.out.println(num1);
        // }else{
        // System.out.println(num2);
        // }

        // Q6.Input currency in rupees and output in USD.
        // answer =
        // float rupees = in.nextFloat();
        // float USD = rupees/82.90f;
        // System.out.println(USD);

        // Q7.To calculate Fibonacci Series up to n numbers.
        // answer =
        // import java.util.Scanner;

        // public class FibonacciSeries {

        // public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // System.out.println("Enter the number of terms for Fibonacci series:");
        // int n = input.nextInt();

        // // Initialize the first two terms of the series
        // int firstTerm = 0, secondTerm = 1;

        // System.out.println("Fibonacci series up to " + n + " numbers:");

        // for (int i = 0; i < n; i++) {
        // System.out.print(firstTerm + " ");

        // // Calculate the next term in the series
        // int nextTerm = firstTerm + secondTerm;
        // firstTerm = secondTerm;
        // secondTerm = nextTerm;
        // }
        // }
        // }

        //Q8.To find out whether the given String is Palindrome or not.
        //aswer
        // import java.util.Scanner;

        // public class PalindromeCheck {
        
        //     public static void main(String[] args) {
        //         Scanner input = new Scanner(System.in);
        
        //         System.out.println("Enter a string:");
        //         String inputString = input.nextLine();
        
        //         if (isPalindrome(inputString)) {
        //             System.out.println("The string is a palindrome.");
        //         } else {
        //             System.out.println("The string is not a palindrome.");
        //         }
        //     }
        
        //     // Function to check if a string is a palindrome
        //     static boolean isPalindrome(String str) {
        //         int length = str.length();
        
        //         // Compare characters from the beginning and end of the string
        //         for (int i = 0; i < length / 2; i++) {
        //             if (str.charAt(i) != str.charAt(length - 1 - i)) {
        //                 return false; // If characters do not match, it's not a palindrome
        //             }
        //         }
        //         return true; // If the loop completes, the string is a palindrome
        //     }
        // }
        


    }
}
