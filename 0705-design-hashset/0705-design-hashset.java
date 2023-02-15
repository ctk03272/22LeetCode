class MyHashSet {
    boolean[] internalKey;

    public MyHashSet() {
        internalKey=new boolean[1000000+1];
    }
    
    public void add(int key) {
        internalKey[key]=true;
    }
    
    public void remove(int key) {
        internalKey[key]=false;
    }
    
    public boolean contains(int key) {
        return internalKey[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */