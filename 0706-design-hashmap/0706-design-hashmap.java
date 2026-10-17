class MyHashMap {
    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[1000];
        for (int i = 0; i < 1000; i++) {
            buckets[i] = new Node(-1, -1);
        }

    }

    public void put(int key, int value) {
        int hash = hash(key);
        Node current = buckets[hash];

        while (current.next != null) {
            if (current.next.key == key) {
                current.next.value = value;
                return;
            }

            current = current.next;
        }

        current.next = new Node(key, value);
    }

    public int get(int key) {
        int hash = hash(key);
        Node current = buckets[hash];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }

    public void remove(int key) {
        int hash = hash(key);
        Node current = buckets[hash];

        while (current.next != null) {
            if (current.next.key == key) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    private int hash(int key) {
        // (key % buckets.length), or we can do --> ((n-1) & hash)
        return key % 1000;
    }
}

class Node {
    int key;
    int value;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna