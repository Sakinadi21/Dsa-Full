package Hashing;

public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public HashTable() {
        this(10); // Corrected constructor call
    }

    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        buckets = new HashNode[numOfBuckets];
    }

    private class HashNode {
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(Integer key, String value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("Key or Value is null !!!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];

        // Check if key already exists, update value if it does
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // If key doesn't exist, create a new node
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[bucketIndex] = node;
    }

    public String get(Integer key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];

        // Search for the key in the linked list
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        return null; // Key not found
    }

    private int getBucketIndex(Integer key) {
        return key % numOfBuckets;
    }

    public String remove(Integer key){
        if(key == null){
            throw new IllegalArgumentException("Key is null!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode previous = null;

        while(head != null){
            if(head.key.equals(key)){
                break;
            }
            previous = head;
            head = head.next;
        }

        if(head == null){
            return null; // Key not found
        }

        size--; // Key found, decrement size

        if(previous != null){
            previous.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }

        return head.value;
    }

    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.put(105, "Tom");
        table.put(21, "Sana");
        table.put(21, "Harry");
        System.out.println("Size: " + table.size());
        System.out.println("Get key 21: " + table.get(21));
        System.out.println("Get key 105: " + table.get(105));
        System.out.println("Get key 30: " + table.get(30)); // This should return null
        System.out.println("Removed key 21: " + table.remove(21));
        System.out.println("Removed key 31: " + table.remove(31)); // This should return null
    }
}
