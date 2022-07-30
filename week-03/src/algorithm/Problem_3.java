package algorithm;

import java.util.LinkedList;
import java.util.Queue;

class AnimalShelf {
    private Queue<int[]> list;
    private int[] notFound = new int[] {-1, -1};
    public AnimalShelf() {
        list=new LinkedList<>();
    }

    public void enqueue(int[] animal) {
        list.offer(animal);
    }

    public int[] dequeueAny() {
        if (list.isEmpty()) return notFound;
        return list.poll();
    }

    public int[] dequeueDog() {
        if (list.isEmpty()) return notFound;
        for (int[] item:list){
            if (item[1]==1){
                list.remove(item);
                return item;
            }
        }
        return notFound;
    }

    public int[] dequeueCat() {
        if (list.isEmpty()) return notFound;
        for (int[] item:list){
            if (item[1]==0){
                list.remove(item);
                return item;
            }
        }
        return notFound;
    }
}

/**
 * Your AnimalShelf object will be instantiated and called as such:
 * AnimalShelf obj = new AnimalShelf();
 * obj.enqueue(animal);
 * int[] param_2 = obj.dequeueAny();
 * int[] param_3 = obj.dequeueDog();
 * int[] param_4 = obj.dequeueCat();
 */
