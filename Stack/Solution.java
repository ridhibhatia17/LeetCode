public class Solution{
    static class Stack {
        int[] arr;
        int top;
        int capacity;
        Stack(int capacity) {
            // Write your code here.
            this.capacity=capacity;
            top=-1;
            arr=new int[capacity];
        }
        public void push(int num) {
            // Write your code here.
            if(top==capacity-1) return;
            arr[++top]=num;
        }
        public int pop() {
            // Write your code here.
            if(top==-1) return -1;
            return arr[top--];
        }
        public int top() {
            // Write your code here.
            if(top==-1) return -1;
            return arr[top];
        }
        public int isEmpty() {
            // Write your code here.
            return (top==-1)?1:0;
        }
        public int isFull() {
            // Write your code here.
            return (top==capacity-1)?1:0;
        }
    }
}