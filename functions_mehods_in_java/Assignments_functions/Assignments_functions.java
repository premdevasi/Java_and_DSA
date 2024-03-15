package functions_mehods_in_java.Assignments_functions;
import java.util.Scanner;
public class Assignments_functions {
// Defined two method to print the maximum number respectively among three
        // numbers entered by the user.
        // System.out.print("Enter number a = ");
        // int a = sc.nextInt();
        // System.out.print("Enter number b = ");
        // int b = sc.nextInt();
        // System.out.print("Enter number c = ");
        // int c = sc.nextInt();
        // int ans = maxNum(a, b, c);
        // System.out.print("your max Number is = "+ans);
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number a = ");
        // int a = sc.nextInt();
        // System.out.print("Enter number b = ");
        // int b = sc.nextInt();
        // System.out.print("Enter number c = ");
        // int c = sc.nextInt();
        // int ans = minNum(a, b, c);
        // System.out.print("your min Number is = "+ans);

        // Define a program to find out number is odd or even.
        // System.out.print("Enter your number = ");
        // int n = sc.nextInt();
        // boolean ans = evenOrOdd(n);
        // if(ans){
        // System.out.println("Number is even");
        // }
        // else{
        // System.out.println("Number is odd");
        // }

        // A Preson is eligble to vote if his/her age is greater than or equal to 18.
        // Define a method to find out if he/she is elogible to vote.
        // System.out.print("Enter your age = ");
        // int age = sc.nextInt();
        // boolean ans = eligbleForVote(age);
        // if(ans){
        // System.out.println("You are eligble for vote");
        // }
        // else{
        // System.out.println("you are not eligable for vote");
        // }

        // Write a program to print the sum of two number entered by user by defining
        // your own method.
        // System.out.print("Enter num1 = ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter num2 = ");
        // int num2 = sc.nextInt();
        // int ans = sumOfTwoNum(num1, num2);
        // System.out.println("Sum of num1 and num2 is = "+ans);

        // Define a method that return the product of two number
        // System.out.print("Enter num1 = ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter num2 = ");
        // int num2 = sc.nextInt();
        // int ans = product(num1, num2);
        // System.out.print("product of two number is = "+ans);

        // Write a program to print the circumference and area of a circul of radius
        // entered by user by defining your own method.
        // System.out.println("Enter the radius of circul");
        // int radius = sc.nextInt();
        // double ans = CircumferenceOfArea(radius);
        // System.out.println(ans);

        // double ans2 = areaCircul(radius);
        // System.out.println(ans2);

        // Define a method to find out if number is prime or not.
        // System.out.print("Enter Number = ");
        // int n = sc.nextInt();
        // boolean ans = isPrime(n);
        // if (ans) {
        //     System.out.println("Number is prime");
        // } else {
        //    System.out.println("Number is not a prime number");
        // }
 
        //Write a program that will ask the user to enter his/her marks(out of 100). Define a method that will dispaly grades accoring to the marks entered as below
    // Marks        Grade 
    // 91-100            AA 
    // 81-90             AB 
    // 71-80             BB 
    // 61-70             BC 
    // 51-60             CD 
    // 41-50             DD 
    // <=40             Fail 
        // System.out.print("Enter your marks = ");
        // int marks = sc.nextInt();
        // String ans = dispalyGrades(marks);
        // System.out.println("Your grades is = "+ans);


        //Write a program to print the factorial of a number by defing a method  name 'Factorial'.
        // System.out.print("Enter your number = ");
        // int n = sc.nextInt();
        // int ans = Factorial(n);
        // System.out.print(ans);

    //    System.out.print("Enter Number = ");
    //   int n = sc.nextInt();
    //    isPalindrome(n);
    //   if(isPalindrome(n)){
    //     System.out.println("Number is Palindrome");
    //   }else{
    //     System.out.println("Number is not Palindrome");
    //   }
        


       //write a function that return the sum of first n nutural number 
    //    System.out.print("Enter Number = ");
    //   int n = sc.nextInt();
    //   int ans = nNatural(n);
    //   System.out.print("sum of n nutural number is = "+ans);


      //write a function to check if a given triplet is a Pythagoorean //triplet or not.
      int a = 3, b = 4, c = 5; // Example triplet (3, 4, 5)
        // if (isPythagoreanTriplet(a, b, c)) {
        //     System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is a Pythagorean triplet.");
        // } else {
        //     System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is not a Pythagorean triplet.");
        // }
    






    
    // Defined two method to print the maximum number respectively among three
    // numbers entered by the user.
    // static int maxNum(int a, int b, int c){
    // if(a>b && a>c){
    // return a;
    // }
    // else if(b>c){
    // return b;
    // }
    // else{
    // return c;
    // }
    // }

    // static int minNum(int a, int b, int c){
    // if(a<b && a<c){
    // return a;
    // }
    // else if(b<c){
    // return b;
    // }
    // else{
    // return c;
    // }
    // }

    // Define a program to find out number is odd or even.
    static boolean evenOrOdd(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    // A Preson is eligble to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is elogible to vote.
    static boolean eligbleForVote(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }

    // Write a program to print the sum of two number entered by user by defining
    // your own method.
    static int sumOfTwoNum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // Define a method that return the product of two number
    static int product(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

    // Write a program to print the circumference and area of a circul of radius
    // entered by user by defining your own method.
    static double CircumferenceOfArea(int radius) {
        float pi = 3.14159f;
        double Circumference = 2 * pi * radius;
        return Circumference;
    }

    static double areaCircul(int radius) {
        float pi = 3.14159f;
        double area = pi * Math.pow(radius, 2);
        return area;
    }

    // Define a method to find out if number is prime or not.
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


    //Write a program that will ask the user to enter his/her marks(out of 100). Define a method that will dispaly grades accoring to the marks entered as below
    // Marks        Grade 
    // 91-100            AA 
    // 81-90             AB 
    // 71-80             BB 
    // 61-70             BC 
    // 51-60             CD 
    // 41-50             DD 
    // <=40             Fail 
    static String dispalyGrades(int marks){
    

     if(marks<=100&&marks>=91){
       return "AA";
     }
     else if(marks<=90&&marks>=81){
      return  "AB";
     }
     else if(marks<=80&&marks>=71){
        return "BB";
     }
     else if(marks<=70&&marks>=61){
        return "BC";
     }
     else if(marks<=60&&marks>=51){
        return "CD";
     }
     else if(marks<=50&&marks>=41){
        return "DD";
     }
     return "fail";
    }

    //Write a program to print the factorial of a number by defing a method  name 'Factorial'.
    static int Factorial(int n){
        int fact = 1;
        for(int i =1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }

    //Write a function to find if a number is a palindrome or not. Take number as parameter.
    static boolean isPalindrome(int n){
        int reversedNum = 0;
        int originalNum = n;
        while (n>0) {
            int lastDigit = n % 10;
        reversedNum = reversedNum * 10 + lastDigit;
        n /= 10;
        }
        return originalNum == reversedNum;
    }

    //write a function that return the sum of first n nutural number 
    static int nNatural(int n){
        int sum= 0;
        for(int i=1;i<=n;i++){
          sum = sum+i;
        }
        return sum;
    }

    //write a function to check if a given triplet is a Pythagoorean triplet or not.
    static boolean isPythagoreanTriplet(int a, int b, int c) {
        // Check if a^2 + b^2 equals c^2
        return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;

        //Write a function that return all prime numbers between two given number
    }
}
