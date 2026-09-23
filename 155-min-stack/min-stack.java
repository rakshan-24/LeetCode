class MinStack {
    Stack<Integer> st;
    Stack<Integer> minS; 
    public MinStack() {
       st=new Stack<>();
       minS=new Stack<>(); 
    }
    
    public void push(int val) {
        st.push(val);
        if(minS.isEmpty() || val<=minS.peek())      minS.push(val);
    }
    
    public void pop() {
        int removed=st.pop();
        if(removed==minS.peek())    minS.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minS.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */