//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

class MinStack {
    Node head;

    public void push(int x) {
        if (head == null) {
            head = new Node(x);
        } else {
            Node newHead = new Node(x);
            //Will be needed for getMin(). Will allow to just check the min value in the head
            newHead.min = Math.min(x, head.min);    
            newHead.next = head;
            head = newHead;
        }
    }

    public void pop() {
        if (head == null) {
            return;
        }   
        head = head.next;
    }

    public int top() {
        if (head == null) 
            return Integer.MAX_VALUE;
            
        return head.data; 
    }

    public int getMin() {
        if (head == null) 
            return Integer.MAX_VALUE;
            
        return head.min;
    }
}

class Node {
    int data;
    int min;
    Node next;
    
    Node(int x) {
        data = x;
        min = x;
        next = null;
    }
}