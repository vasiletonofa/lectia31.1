import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); //  String[10]
//        List<String> lis2 = new LinkedList<>(); // Node(Object data, Node prev, Node next)  ->

        list.add("A");
        list.add("B");
        // 10000000
        list.add("Z");

        String z =  list.get(4); // O(1)

//        lis2.add("A");
//        lis2.add("B");
//
//        System.out.println("ArrayList: " + list);
//        System.out.println("LinkiedList: " + lis2);
//
//        list.get(0);
//        lis2.get(1);

        //   X ->  A -> B -> C -> D ... 100000  -> Z  -> 10000   // O(1) -> Big O notation

        //  X -> A -> <- Z =   O(n)

        String[] array = new String[50];

        array[0] = "X";
        array[1] = "A";
        array[2] = "C";
        array[3] = "D";
        array[49] = "Z"; // O(1)

        List<String> list1 = new ArrayList<>(); // [10]
        list1.add("a");

        //  X ->  A -> B -> C -> D ... 100000  -> V

        // O(n)

        String a = array[2];

        //  array[100000000] = "Z"

        // ArrayList:  Rapid la citire
        // LinkedList: Rapid la adaugare in fata

        // Baza de date -> ArrayList ->  citim ->  modificare -> DB


        Set<String> hashSet = new HashSet<>();
        // 1. Avem elemente unice
        // 2. Nu se pastreaza ordinea de adaugare

        Set<String> set = new LinkedHashSet<>();

        // 1. Avem elementele unice
        // 2. Se pastreaza ordinea de inserare a elementelor
        // 3. Performanta mai slaba ca la HashSet
//        Deque<String> deque = new LinkedList<>();

        Map<String, String> map = new HashMap<>();
        // 1. Cheile unice
        // 2. Nu se pastreaza ordinea de inserare

        Map<String, String> linkedMap = new LinkedHashMap<>();
        // 1. Cheile unice
        // 2. Se pastreaza ordinea de inserare
        // 3. Performanta este mai slaba decat la map

        linkedMap.put("A", "B");




    }
}