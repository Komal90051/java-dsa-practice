import java.util.ArrayList;
import java.util.*;
public class ArrayList1 {
    public static void main(String args[]){
        //className objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        // add Operation
        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());

        list.add(1,9);  // O(n)
        System.out.println(list);

        // Get Operation
        int element = list.get(2);
        System.out.println(element);

        // Remove Element 
        list.remove(2);
        System.out.println(list);

        // Set Element at Index
        list.set(2,10);
        System.out.println(list);

        // contains element 
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        }
    
}
