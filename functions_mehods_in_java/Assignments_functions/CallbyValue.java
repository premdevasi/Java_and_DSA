package functions_mehods_in_java.Assignments_functions;

class Car{
    String  name;
    float milage;
    int cost;
}


public class CallbyValue {
    public static void main(String[] args) {
        //   int a = 10;
        //   int b = 20;
    
        //   swap(a, b);
        //   System.out.println(a+" "+b);
        //   String name = "prem devasi";
        //   changeName(name);
        // System.out.println(name);
    
      //call by value code
        // int a = 1000;
        // System.out.println(a);
        // int b;
        // b = a;
        // System.out.println(b);
        // b = 2000;
        // System.out.println(b);
        // System.out.println(a);
    
        //pass by vlue
        Car a = new Car();
        }
        
    
    
        static void changeName(String name){
             name = "Kunal Khushwaha";
        }
    
        static void swap(int a, int b){
             int temp = a;
             a = b;
             b = temp;
        }
}
