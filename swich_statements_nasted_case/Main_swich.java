package swich_statements_nasted_case;

import java.util.Scanner;

public class Main_swich {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // String fruit = in.next();
        // String a = "kunal";
        // String b = "kunal";
        // System.out.println(a==b);

        // switch (fruit) {
        // case "Mango":
        // System.out.println("king of fruit");
        // break;

        // case "Apple":
        // System.out.println("a sweet red fruit");
        // break;

        // case "Orange":
        // System.out.println("round fruit");
        // break;

        // case "Grapes":
        // System.out.println("small fruit");
        // break;

        // default:
        // System.out.println("please enter a valid fruit");

        // int day = in.nextInt();
        // switch (day) {
        // case 1 -> System.out.println("Monday");
        // case 2 -> System.out.println("Tuesday");
        // case 3 -> System.out.println("Wednesday");
        // case 4 -> System.out.println("Thursday");
        // case 5 -> System.out.println("Friday");
        // case 6 -> System.out.println("Saturday");
        // case 7 -> System.out.println("Sunday");

        
        int emailId = in.nextInt();
        String department = in.next();
        switch (emailId) {
            case 1:
                System.out.println("Prem Devasi");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
            System.out.println("Emp number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "management":
                        System.out.println("management");
                        break;

                    default:
                    System.out.println("no department entred");
                        break;   

                }
                break;
            default:
            System.out.println("Enter correct empoly id");
                break;
        }
    }
}
