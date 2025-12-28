import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_sorting {
    public static void main(String args[]){
        //className objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        // add Operation
        list.add(1); // O(1)
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(5); 
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);  // ascending

        // Descending 
        Collections.sort(list, Collections.reverseOrder());
        // Comparator - function logic
        System.out.println(list);
}
}