/*
Single linked list has reference to next node.
Head and Initial Tails are known at the start

1 ---> 2 ---> 3 ----> 5 ----> null

1. Adding a node to Single Linked List
    
    Let's say we add 4 at fourth position 

        Step 1: 1 ---> 2 ---> 3 ---> 5 ----> null
                            4
                            
        Step 2: 1 ---> 2 ---> 3 ---> 5 ----> null
                            4 --->

        Step 3: 1 ---> 2 ---> 3           5 ----> null
                                ---> 4 --->

        1 ---> 2 ---> 3 ---> 4 ---> 5 ----> null

2. Removing a node from a Single Linked List
    Let's say we take out 4 
    1 ---> 2 ---> 3 ---> 4 ---> 5 ----> null

        Step 1: 1 ---> 2 ---> 3 ---> 4 ---> 5 ----> null
                            ^             ^
                            |             |
                            |             |
                            trav1         trav2

        Step 2: 1 ---> 2 ---> 3     4 ---> 5 ----> null
                            ^ ---------> ^
                            |            |
                            |            |
                            trav1        trav2

        Step 3: 1 ---> 2 ---> 3 ---> 5 ----> null and take care of the recently removed node if you are managing the memory


3.Time complexity in the Linear List
    Access - O[n]  
    Searching  - O[n]
    Insertion at head and tail - O[1]
    Removal at head - O[1]
    Removal at tail -O[n] - Since we have the tail at the first deletiobn but again it wont be there 
                            so it takes the whole traversal 

4. Methods to be implemented 
    size()
    isEmpty()
    add()
    addLast()
    addFirst()
    peekFirst()
    peekLast()
    removeFirst()
    removeLast()
    remove()
    removeAt()
    remove()
    indexOf()
    contains()
    toString()
    
*/

package LL;

public class Node {
    public static Node head;
    public static Node tail;
    private int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;       
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    
    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    // Gets next node in the linked list 
    public Node getNextNode(Node currentNode){ 
        return currentNode.next;
    }

    public void getLinkedlist() {
        Node currentNode = head;
        while(currentNode.next != null) {
            System.out.print(currentNode.data + "--> ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // size()
    public int size() {
        int count = 0;
        Node tempHead = this.head;
        while(tempHead.next != null){
            count = count + 1;
            tempHead = tempHead.next;
        }
        return count;
    }

    // isEmpty()
    public Boolean isEmpty() {
        return false;
    }

    // add()
    public Node add(int data) {
        return Node.head;
    }

    // addLast()
    public Node addFirst() {
        return Node.head;
    }

    // addFirst()
    public Node addLast() {
        return Node.head;
    }

    // peekFirst()
    public Node peekFirst() {
        return Node.head;
    }

    // peekLast()
    public Node peekLast() {
        return Node.head;
    }
    
    // removeFirst()
    public Node removeFirst() {
        return Node.head;
    }
    
    // removeLast()
    public Node removeLast() {
        return Node.head;
    }
    
    // remove()
    public Node remove(Node n) {
        return Node.head;
    }

    // removeAt()
    // remove()
    // indexOf()
    // contains()
    // toString()
    public static void main(String[] args) {

    }

}