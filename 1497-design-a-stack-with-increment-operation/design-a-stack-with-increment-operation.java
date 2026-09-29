class CustomStack {
    private Stack<Integer> st;
    private int maxSize;
    public CustomStack(int maxSize) {
        st=new Stack<>();
        this.maxSize=maxSize;
    }
    
    public void push(int x) {
        if(st.size()<maxSize)
            st.push(x);
    }
    
    public int pop() {
        if(st.isEmpty())    return -1;
        int removed=st.pop();
        return removed;
    }
    
    public void increment(int k, int val) {
        int n=Math.min(k,st.size());
        for(int i=0;i<n;i++){
            st.set(i, st.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */