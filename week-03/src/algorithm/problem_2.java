package algorithm;

import java.util.ArrayList;
import java.util.List;

class RecentCounter {

    private List<Integer> list;
    private int idx;

    public RecentCounter() {
        list = new ArrayList<>();
        idx = 0;
    }

    public int ping(int t) {
        list.add(t);
        while (t - list.get(idx) > 3000){
            idx++;
        }
        return list.size() - idx;
    }
}
