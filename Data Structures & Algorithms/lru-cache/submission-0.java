class LRUCache {
    Node left;
    Node right;
    HashMap <Integer,Node> map;
    int size;
    public LRUCache(int capacity) {
        this.size = capacity;
        this.map = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = right;
        this.right.prev = left;
    }
    void remove(Node node){
        Node old = node.prev;
        Node nxt = node.next;
        old.next = nxt;
        nxt.prev = old;
    }
    void insert(Node node){
        Node old = this.right.prev;
        old.next = node;
        node.prev = old;
        node.next = this.right;
        this.right.prev = node;
    }
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node  = map.get(key);
            remove(node);
            map.remove(key);
        }

        Node newNode = new Node(key,value);
        insert(newNode);
        map.put(key,newNode);

        if(map.size() > size){
            Node lru = this.left.next;
            remove(lru);
            map.remove(lru.key);
        }
    }
}
class Node{
    Node next;
    Node prev;
    int key;
    int value;
    Node(int key, int value){
        this.next = null;
        this.prev = null;
        this.key = key;
        this.value = value;
    }
} 
