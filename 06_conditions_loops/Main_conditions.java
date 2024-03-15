import java.util.Scanner;
public class Main_conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // while loop
        // int i = 0;
        // while (i<=n) {
        // System.out.println("Prem devasi");
        // i++;
        // }

        // do while loop
        // int num =1;
        // do {
        // System.out.println("hello world");
        // } while (num!=1);

        // largest number
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c = in.nextInt();

        // if(a>b){
        // System.out.println(a);
        // }
        // else if(b>c){
        // System.out.println(b);
        // }
        // else{
        // System.out.println(c);
        // }
        // int max = a;
        // if(b>max){
        // max = b;
        // }
        // if(c>max){
        // max = c;
        // }
        // System.out.println(max);

        // char is uppercase or lowercase
        // char ch = in.next().trim().charAt(0);
        // if(ch>='a' && ch<='z'){
        // System.out.println("lowercase");
        // }else{
        // System.out.println("uppercase");
        // }
        // System.out.println(ch);

        // fibonacci number - sum of two previus numbe is fibonacci
        // Ex- 0,1,1,2,3,5,8,13
        // int n = in.nextInt();
        // int a =0;
        // int b= 1;
        // int count = 2;
        // while(count<=n){
        // int temp = b;
        // b= b+a;
        // a = temp;
        // count++;
        // }
        // System.out.println(b);

        // find ripited number
        // int n = 455365;
        // int count= 0;
        // while(n>0){
        // int rem = n%10;
        // if(rem==5){
        // count++;
        // }
        // n /= 10;

        // }
        // System.out.println(count);

        // reverse number
        // int n = 23597;
        // int res = 0;
        // while(n>0){
        // int lastd = n%10;
        // res = (res*10)+lastd;
        // n/=10;
        // }
        // System.out.println(res);

        // calculator Program
        int ans = 0;
        while (true) {
            System.out.print("Enrter your opretor = ");
        char opert = in.next().trim().charAt(0);

            if (opert == '+' || opert == '-' || opert == '*' || opert == '/' || opert == '%') {
                System.out.print("Enter Your num1 = ");
                int num1 = in.nextInt();
                System.out.print("Enter Your num2 = ");
                int num2 = in.nextInt();

                if (opert == '+') {
                    ans = num1 + num2;
                }
                if (opert == '-') {
                    ans = num1 - num2;
                }
                if (opert == '/') {
                    ans = num1 / num2;
                }
                if (opert == '*') {
                    ans = num1 * num2;
                }
                if (opert == '%') {
                    ans = num1 % num2;
                }

            } else if (opert == 'x' || opert == 'X') {
                break;
            } else {
                System.out.println("Invalide opreation");
            }
            System.out.println("Your ans. is = " + ans);
        }
       
    }
}
