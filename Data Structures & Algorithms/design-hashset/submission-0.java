class MyHashSet {
    Set set;
    public MyHashSet() {
        set = null;
    }
    
    public void add(int key) {
        Set current = set;
        while(current != null)
        {
            if(current.value == key) return;
            current = current.next;
        }
        set = new Set(key, set);
    }
    
    public void remove(int key) {
        if(set==null) return;
        if(set.value==key){
            set = set.next;
            return;
        }
        Set current = set;
        while(current != null && current.next.value !=key)
        {
            current = current.next;
        }
        if(current.next != null) current.next = current.next.next;
    }
    
    public boolean contains(int key) {
        if(set == null) return false;
        if(set.value == key) return true;

        Set current = set;
        while(current != null)
        {
            if(current.value == key) return true;
            current = current.next;
        }
        return false;
    }
}
class Set{
    int value;
    Set next;
    Set(){}
    Set(int value,Set next){
        this.value = value;
        this.next = next;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */