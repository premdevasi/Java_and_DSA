package arrays_and_arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class MultiDimension_ArrayList {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
         Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();

        // Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);//output = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    }
}
