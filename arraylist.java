import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Add element

        list.add(2);
        list.add(5);
        list.add(7);
        System.out.println(list);
        // get Element at specific index;
        int element = list.get(0);
        System.out.println(element);
        list.add(1, 3);
        System.out.println(list);

        System.out.println(list);
        // size
        int size = list.size();
        // loop
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        // Sorting
            Collections.sort(list);
            System.out.print(list);
}
}
