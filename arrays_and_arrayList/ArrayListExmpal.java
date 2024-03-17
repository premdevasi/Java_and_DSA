package arrays_and_arrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExmpal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);//we can store as much as we can there is not limit in ArrayList<>
        // list.add(67);
        // list.add(545);
        // list.add(541);
        // list.add(562);
        // list.add(87);
       
        // System.out.println(list.contains(67));//kya es arrayList me 67 ya nhi ham pata laga sakte he

        // list.set(0, 99);//oth index change in 99

        // list.remove(2);//we can remove value from index
        
        // System.out.println(list);

        //input
        for(int i=0;i<5;i++){
          list.add(sc.nextInt());
        }
 
        //get index at any index
        for(int i=0;i<5;i++){
      System.out.println(list.get(i));//pass index here, jase pahle ham arr[index] karke array me index nikalte the vo ab yaha pe nhi nikal sakte he
        }
        System.out.println(list);
    }
}
