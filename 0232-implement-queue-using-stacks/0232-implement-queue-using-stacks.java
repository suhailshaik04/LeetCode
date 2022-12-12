class MyQueue {

    Stack<Integer> stack;
    public MyQueue() {
        stack=new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        Stack<Integer> temp=new Stack<>();
        int n=stack.size();
        for(int i=0;i<n;i++){
            temp.push(stack.pop());
        }
        
        int m=temp.pop();
        int nn=temp.size();
        for(int i=0;i<nn;i++){
            stack.push(temp.pop());
        }
        return m;
        
    }
    
    public int peek() {
        Stack<Integer> temp=new Stack<>();
        int n=stack.size();
        for(int i=0;i<n;i++){
            temp.add(stack.pop());
        }
        int a=temp.peek();
        int nn=temp.size();
        for(int i=0;i<nn;i++){
            stack.push(temp.pop());
        }
        return a;
    }
    
    public boolean empty() {
        return stack.size()<=0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */