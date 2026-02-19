class MyQueue {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    public MyQueue() {
    }
    public void push(int x) {
        in.push(x);
    }
    public int pop() {
        moveIfNeeded();
        return out.pop();
    }
    public int peek() {
        moveIfNeeded();
        return out.peek();
    }
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }    
    private void moveIfNeeded() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }
}