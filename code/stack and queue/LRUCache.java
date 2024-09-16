// https://leetcode.com/problems/lru-cache/   146

import java.util.HashMap;



public class LRUCache {
    public static void main(String[] args) {
        
    }

    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int cap;
    HashMap<Integer, Node> mpp = new HashMap<>();

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }

    private void addNode(Node newNode){
        Node temp = head.next;

        newNode.next = temp;
        newNode.prev = head;

        head.next = newNode;
        temp.prev = newNode;
    }

    private void deleteNode(Node delNode){
        Node prevPointer = delNode.prev;
        Node nextPointer = delNode.next;

        prevPointer.next = nextPointer;
        nextPointer.prev = prevPointer;
    }

    public int get(int key) {
        if(mpp.containsKey(key)){
            Node resNode = mpp.get(key);
            int ans = resNode.val;

            mpp.remove(key);  // removes from hashmap
            deleteNode(resNode);  // deletes node
            addNode(resNode);

            mpp.put(key, head.next);  // adds back in hashmap
            return ans;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            Node curr = mpp.get(key);
            mpp.remove(key);  // removes from hashmap
            deleteNode(curr);  // deletes node
        }

        if(mpp.size() == cap){
            mpp.remove(tail.prev.key);  // removes from hashmap
            deleteNode(tail.prev);
        }

        addNode(new Node(key, value));  // adds a NEW node
        mpp.put(key, head.next);  // adds back in hashmap
    }
}
