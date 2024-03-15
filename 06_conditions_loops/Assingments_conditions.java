
import java.util.Scanner;
public class Assingments_conditions {
     // Find if a number is palindrome or not
  // static boolean isPalindrome(int num) {
  // int originalNumber = num;
  // int reversedNumber = 0;

  // while (num > 0) {
  // int digit = num % 10;
  // reversedNumber = reversedNumber * 10 + digit;
  // num /= 10;
  // }

  // return originalNumber == reversedNumber;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Area Of Circle Java Program
    // int radius = in.nextInt();
    // float p = 3.14159f;
    // int rafiussqure = radius*radius;
    // float area = (int)p*rafiussqure;
    // System.out.println(area);

    // Area Of Triangle
    // System.out.print("Enter base of Triangle = ");
    // int base = in.nextInt();
    // System.out.print("Enter height of Triangle = ");
    // int height = in.nextInt();
    // float TriangleArea = 0.5f*base*height;
    // System.out.println(TriangleArea);

    // Area Of Rectangle Program
    // System.out.print("Enter length of rectangle = ");
    // int length = in.nextInt();
    // System.out.print("Enter width of rectangle = ");
    // int width = in.nextInt();
    // int RectangleArea = length*width;
    // System.out.println(RectangleArea);

    // Input a number and print all the factors of that number (use loops).
    // System.out.println("Enter a number");
    // int number = in.nextInt();
    // System.out.println("Factors of "+number+" are:");
    // for(int i=1;i<=number;i++){
    // if(number%i==0){
    // System.out.println(i);
    // }
    // }

    // Take integer inputs till the user enters 0 and print the sum of all numbers
    // (HINT: while loop)
    // int sum = 0;
    // int input;
    // while ((input = in.nextInt()) != 0) {
    // sum += input;
    // }

    // System.out.println("Sum of entered numbers: " + sum);

    // Take integer inputs till the user enters 0 and print the largest number from
    // all.
    // int largestNumber = 0;
    // int currentNumber;
    // while ((currentNumber = in.nextInt()) != 0){
    // if(currentNumber>largestNumber){
    // largestNumber = currentNumber;
    // }
    // }
    // System.out.println(largestNumber);

    // Addition Of Two Numbers
    // int num1 = in.nextInt();
    // int num2 = in.nextInt();
    // int sum = num1+num2;
    // System.out.println(sum);

    // Factorial Program In Java
    // int inpput = in.nextInt();
    // int fact = 1;
    // for(int i=1;i<=inpput;i++){
    // fact = fact*i;
    // }
    // System.out.println(fact);

    // Calculate Electricity Bill
    // int PowerConsumption = in.nextInt();
    // float ElectricityRate = in.nextFloat();
    // float ElectricityBill = PowerConsumption * ElectricityRate;
    // System.out.println(ElectricityBill);

    // Calculate Average Of N Numbers
    // System.out.print("Enter the count of numbers (N): ");
    // int n = in.nextInt();
    // int sum = 0;
    // int count = 0;
    // for(int i=1;i<=n;i++){
    // System.out.print("Enter number " + i + ": ");
    // int num = in.nextInt();
    // sum += num;
    // count++;
    // }
    // float averageofN = (float)sum/count;
    // System.out.println("Average of N numbers: " + averageofN);

    // Calculate Discount Of Product
    // System.out.print("Enter original price: ");
    // int op = in.nextInt();
    // System.out.print("Enter discount percentage: ");
    // double dp = in.nextDouble();
    // double da = dp*op/100;
    // double discountedprice = op-da;
    // System.out.println("Discounted Price: " + discountedprice);

    // Calculate Distance Between Two Points
    // System.out.print("Enter x-coordinate of the first point: ");
    // double x1 = in.nextDouble();
    // System.out.print("Enter y-coordinate of the first point: ");
    // double y1 = in.nextDouble();

    // System.out.print("Enter x-coordinate of the second point: ");
    // double x2 = in.nextDouble();
    // System.out.print("Enter y-coordinate of the second point: ");
    // double y2 = in.nextDouble();
    // double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    // System.out.println("Distance between the two points: " + distance);
    // in.close();

    // Calculate Commission Percentage
    // System.out.print("Enter Toatal sales = ");
    // int ToatalSeles = in.nextInt();
    // System.out.print("Enter Commission percentage = ");
    // int CommissionPercentage = in.nextInt();
    // double Commission = ToatalSeles*((double)CommissionPercentage/100);
    // System.out.print("Your percentage is = " + Commission);

    // Calculate Depreciation of Value
    // System.out.print("Enter Cost of the asset = ");
    // int CostOfAsset = in.nextInt();
    // System.out.print("Enter Residual Value = ");
    // int ResidualValue = in.nextInt();
    // System.out.print("Enter Useful Life = ");
    // int UsefulLife = in.nextInt();

    // double DepreciationPerYear = (CostOfAsset-ResidualValue)/UsefulLife;
    // System.out.print("Depreciation per year = " + DepreciationPerYear);

    // Compound Interest Java Program
    // System.out.println("Enter your Principal Amount");
    // double p = in.nextDouble();

    // System.out.println("Enter your annual interest rate");
    // double r = in.nextDouble();
    // r = r / 100; // convert percentage to decimal

    // System.out.println("Enter your interest is compounded per unit");
    // int n = in.nextInt();

    // System.out.println("Enter Time in years");
    // int t = in.nextInt();

    // double compoundInterest = p * Math.pow((1 + r / n), n * t) - p;

    // System.out.println("Your Compound Interest = " + compoundInterest);

    // Calculate Average Marks
    // System.out.print("Enter the number of subject that you have = ");
    // int NumofSub = in.nextInt();
    // int sumOfMaks = in.nextInt();
    // for(int i=1;i<=NumofSub;i++){
    // System.out.print("Enter marks of subjects = ");
    // int marks = in.nextInt();
    // sumOfMaks += marks;
    // }

    // double AverageMarks = sumOfMaks/NumofSub;
    // System.out.print("Your Average Marks = "+ AverageMarks);

    // Sum Of N Numbers
    // System.out.print("Enter N value = ");
    // int n = in.nextInt();
    // int sum = 0;
    // for(int i=1;i<=n;i++){
    // sum += i;
    // }
    // System.out.print("sum is = "+sum);

    // Find if a number is palindrome or not
    // System.out.print("Enter a number: ");
    // int number = in.nextInt();

    // if (isPalindrome(number)) {
    // System.out.println(number + " is a palindrome.");
    // } else {
    // System.out.println(number + " is not a palindrome.");
    // }

    //Future Investment Value
    // System.out.print("Enter your present value or initial investment  = ");
    // int pv = in.nextInt();
    // System.out.print("Enter annual interest rate = ");
    // float r = in.nextFloat();
    // r = r/100;
    // System.out.print("Enter time the money is invested or borrowed for, in years  = ");
    // int t  = in.nextInt();

    // double fv = pv*Math.pow(1+r, t);
    // System.out.print("Your future Investment Value = "+fv);
 

    //Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
    // int sumNegative = 0;
    //     int sumPositiveEven = 0;
    //     int sumPositiveOdd = 0;

    //     System.out.println("Enter a list of numbers. Enter 0 to terminate the list.");

    //     while (true) {
    //         System.out.print("Enter a number: ");
    //         int number = scanner.nextInt();

    //         if (number == 0) {
    //             break; // Exit the loop if the user enters 0
    //         }

    //         if (number < 0) {
    //             sumNegative += number;
    //         } else if (number % 2 == 0) {
    //             sumPositiveEven += number;
    //         } else {
    //             sumPositiveOdd += number;
    //         }
    //     }

    //     System.out.println("Sum of negative numbers: " + sumNegative);
    //     System.out.println("Sum of positive even numbers: " + sumPositiveEven);
    //     System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);

 
  }
}
