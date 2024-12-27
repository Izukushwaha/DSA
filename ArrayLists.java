import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();

        list.add(1);
        list.add(7);
        list.add(5);
        System.out.println(list);

        System.out.println(list.get(0));
        int firstElement=list.get(0);
        System.out.println(firstElement);

        list.add(1, 8);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.add(2, 6);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        
    }
}
