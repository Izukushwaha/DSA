// All the Classes that we need to import from java.util package :
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {

        // Creating a HashMap :
        HashMap<Integer, String> hm = new HashMap<>();

        // Putting the keys and values together:
        hm.put(1, "Chirag");
        hm.put(2, "Jahnvi");
        hm.put(3, "Arpita");
        hm.put(4,"Syrix");
        hm.put(5, "Richa");

        // Printing the HashMap :
        System.out.println(hm);

        // Updating the key value :
        hm.put(2, "Damayanti");

        // Contains method : gives true and false.
        if(hm.containsKey(5)){
            System.out.println("Key Exist");
        }else System.out.println("Key does not Exist");

        // Get Method : gives value if exist or null if value dont exist.
        System.out.println(hm.get(2));
        System.out.println(hm.get(6));


        // Iterate through a HashMap: Using entrySet().
        // for loop : for(int value : arr)
        for(Map.Entry<Integer, String> e : hm.entrySet()){
            System.out.print(e.getKey()+" : ");
            System.out.println(e.getValue());
        }

        // Removing an Element From a HashMap : by key or by key and value, but not from value and it does not through any error(IMPORTENT).

        //hm.remove("chirag");
        hm.remove(4);

        // Iterate through keySet();
        Set<Integer> keys = hm.keySet();
        for(int key : keys){
            System.out.println(key+" : "+hm.get(key));
        }
    }
}
