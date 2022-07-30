package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class problem_1 {
    /**
     *
     * @param tickets
     * @param k 表示第k个人
     * @return  返回第k个人买完票所需的时间
     */
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;
        for(int i = 0; i < tickets.length; i++) q.add(i);
        while(tickets[k] != 0){
            int t = q.poll();
            cnt++;
            tickets[t]--;
            if(tickets[t] != 0) q.add(t);
        }
        return cnt;
    }
}
