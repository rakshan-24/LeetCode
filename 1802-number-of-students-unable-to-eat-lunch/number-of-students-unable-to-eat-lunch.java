class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int st:students){
            q.offer(st);
        }
        int count=0,i=0;
        while(!q.isEmpty() && count<q.size()){
            if(q.peek()==sandwiches[i]){
                q.poll();
                i++;
                count=0;
            }else{
                count++;
                q.offer(q.poll());
            }
        }
        return q.size();
    }
}