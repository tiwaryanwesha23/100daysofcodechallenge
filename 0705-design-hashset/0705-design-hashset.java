class MyHashSet {
    boolean[] contains;
    public MyHashSet() {
        contains = new boolean[1000001];
    }
    public void add(int key) {
        contains[key] = true;
    }
    public void remove(int key) {
        contains[key] = false;
    }
    public boolean contains(int key) {
        return contains[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */