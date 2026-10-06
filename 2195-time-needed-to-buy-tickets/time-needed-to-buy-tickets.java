class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.offer(i);
        }
        int sec = 0;
        while (tickets[k]!=0) {
            int curr=q.poll();
            tickets[curr]--;
            sec++;
            if(tickets[curr] > 0) {
                q.offer(curr);
            }
        }

        return sec;
    }
}