import java.util.*;
import java.util.LinkedList;
public class CollectionsQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }


        q2.add(10);
        q2.add(20);
        q2.add(30);
        q2.add(40);
        q2.add(50);

        while(!q2.isEmpty()){
            System.out.println(q2.peek());
            q2.remove();
        }
    }
    

}
