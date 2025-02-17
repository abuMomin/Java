package $0_Data_Structure;
/*
// The data-type of hashmap can not be primitive type. To use primitive types,  you must specify an equivalent wrapper class (Integer, Double, Boolean, etc.)
// Java Unboxing: Converts an Integer object → primitive (int) automatically
// Java Autoboxing: Converts a primitive (int) → Wrapper object (Integer) automatically.
// HashMap provides 4 constructors: HashMap(), HashMap(int initialCapacity), HashMap(int initialCapacity, float loadFactor), HashMap(Map map)
// FURTHER STUDIES REQUIRED regarding: Map, Hashing, Set, Generics, Cloneable, Serializable.
// (https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/)
//
 */

import java.util.HashMap;

public class HashMap_DS {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap_1 = new HashMap<>();

        hashMap_1.put("Win", 27);   // store in key-value pair, if the key already exists overrides the value.
        hashMap_1.put("Enan", 22);      // Java Autoboxing: Converts a primitive (int) → Wrapper object (Integer) automatically.
        hashMap_1.put("Chadni", 26);
        hashMap_1.put("Ammu", 60);
        hashMap_1.put("Abbu", 67);

        System.out.println(hashMap_1);  // hashmap print
        System.out.println(hashMap_1.get("Ammu"));  // get value by key
        System.out.println(hashMap_1.size());       // hashmap size

        System.out.println(hashMap_1.containsKey("Waqi"));      // Check whether the key exists in the hashmap --> return boolean
        System.out.println(hashMap_1.containsValue(26));       // Check whether the value exists in the hashmap --> return boolean

        hashMap_1.replace("Prithul", 31);       //Write to an entry in the map only if it exists
        System.out.println(hashMap_1);          // key-value is not inserted as "Prithul" doesn't exist

        hashMap_1.putIfAbsent("Prithul", 31);       //Write an entry into the map but only if an entry with the same key does not already exist
        System.out.println(hashMap_1);          // key-value has been inserted as "Prithul" doesn't exist

        HashMap<String, Integer> hashMap_2 = new HashMap<>();
        hashMap_2.put("Osman", 32);
        hashMap_2.put("Waqi", 37);
        hashMap_1.putAll(hashMap_2);        //Insert all of the entries from another map into this map.
        System.out.println(hashMap_1);

        // iterate hashmap keys
        for (String key: hashMap_1.keySet()) {
            System.out.print(key + "\t");
        }
        System.out.println();
        // iterate hashmap values
        for (int values: hashMap_1.values()) {      // Java Unboxing: Converts an Integer object → primitive (int) automatically
            System.out.print(values + "\t");
        }

        System.out.println();
        System.out.println(hashMap_1.entrySet());   // returns all the entries
        System.out.println(hashMap_1.isEmpty());       // check if the map is empty --> returns boolean

        hashMap_1.clear();              // clear hashmap
        System.out.println(hashMap_1);

        // hashmap of similar data-type.
        HashMap<Integer, Integer> hashMap_3 = new HashMap<>();
        hashMap_3.put(0,43);
        hashMap_3.put(1,23);
        hashMap_3.put(2,65);

        System.out.println(hashMap_3);


        // finding key by value in hashmap

    }
}
