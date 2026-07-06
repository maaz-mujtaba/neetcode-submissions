class MyHashMap {
    Map map;
    public MyHashMap() {
        map = null;
    }
    
    public void put(int key, int value) {
        Map current = map;

        while(current != null)
        {
            if(map.key == key)
            {
                map.value = value;
                return;
            }
            current = current.next;
        }
        map = new Map(key,value,map);
    }
    
    public int get(int key) {
        if(map==null) return -1;
        Map current = map;

        while(current != null)
        {
            if(current.key == key) return current.value;
            current = current.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        if(map==null) return;
        if(map.key == key){
            map = map.next;
            return;
        }
        if(map==null) return;
        Map current = map;

        while(current.next != null && current.next.key != key)
        {
            current = current.next;
        }
        if(current.next != null) current.next = current.next.next;
    }
}
class Map{
    int key;
    int value;
    Map next;
    Map(){}
    Map(int key,int value,Map next){
        this.key = key;
        this.value = value;
        this.next = next;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */