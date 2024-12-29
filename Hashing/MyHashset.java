import java.util.HashSet; 
import java.util.Iterator;

public class MyHashset {
    public static void main(String[] args) {

        // Creating a HashSet : 
        HashSet<Integer> hs = new HashSet<>(); 
        System.out.println("HashSet created successfully.");

        // Adding Elements : 
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(50);

        System.out.println("Size of the hs : "+hs.size());

        // Contains Method : 
        if(hs.contains(8787)){
            System.out.println("hs contains 20");
        }else System.out.println("does not contains 20");

        // Removing Elements : 
        hs.remove(20);
        System.out.println("After removing 20 : "+hs);

        // Creating Iterator Object from Iterator class :
        Iterator<Integer> it = hs.iterator();

        // Using hasNext() and next() Methods from Iterator Class :
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }
        System.out.println();

        // Checking if HashSet is empty or not :
        if(!hs.isEmpty()){
            System.out.println("Hashset is not empty.");
        }
    }
}
