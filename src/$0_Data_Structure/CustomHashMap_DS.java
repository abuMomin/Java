package $0_Data_Structure;
/*
// Ques: if there is no HashMap in Java, how can you implement one?
Ans: By this given code, using Object[][] array, but has limitations
// Limitation 1: Fixed size: The array size is predefined, so we can't dynamically expand like Java's HashMap.
// Limitation 2: Slow lookup (O(n)): Since we search linearly, performance is worse than a real HashMap (O(1)).
// Limitation 3: No collision handling: Doesn't use hashing, so it lacks efficient storage and collision resolution.
// Improvements: Using a linked list (chaining), Using an actual hash function, Using an array of linked lists or trees (like Java's HashMap<K,V>)
 */
public class CustomHashMap_DS {
    public static void main(String[] args) {
        CustomHashMap hashMap_1 = new CustomHashMap(5);

        hashMap_1.put("Win", 27);
        hashMap_1.put("Enan", 22);
        hashMap_1.put("Chadni", 26);
        hashMap_1.put("Ammu", 60);
        hashMap_1.put("Abbu", 67);

        System.out.println(hashMap_1.get("Chadni"));
        hashMap_1.display();
    }
}

class CustomHashMap{
    private Object[][] map;     // Array of key-value pairs
    private int size;           // Numbers of element stored

    public CustomHashMap(int capacity) {
        map = new Object[capacity][2];               // initialize the array [Hashmap rows][2 columns for key and value per row]
        size = 0;
    }

    public void put(Object key, Object value){
        // Check if the key already exists, then override
        for (int i = 0; i < size; i++){
            if (map[i][0].equals(key)){
                map[i][1] = value;
                return;
            }
        }

        // if the key doesn't exist, insert key-value
        if(size < map.length)       // check if the map capacity is full
            map[size++] = new Object[]{key, value};     // insert key value, then increase size by 1
        else System.out.println("Hashmap is Full!");
    }

    public Object get(Object key){          // Method to get value by key
        for (int i = 0; i < map.length; i++) {
            if (map[i][0].equals(key)){
                return map[i][1];
            }
        }
        return null;        // key not found
    }

    public void display(){          // Method to dispkay all the key value pairs
        System.out.print("Custom Hashmap: [");
        for (int i = 0; i < size; i++){
            System.out.print(" {" + map[i][0] + ","+map[i][1]+"},");
        }
        System.out.println(" ]");
    }

}
