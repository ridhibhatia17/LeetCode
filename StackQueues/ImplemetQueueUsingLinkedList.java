public class Solution extends Queue{

    // Enqueue
    public void push(int x) {

        Node newNode = new Node(x);

        // If queue is empty
        if(front == null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue
    public int pop() {

        // If queue empty
        if(front == null){
            return -1;
        }

        int val = front.data;
        front = front.next;

        // If queue becomes empty after pop
        if(front == null){
            rear = null;
        }

        return val;
    }
}