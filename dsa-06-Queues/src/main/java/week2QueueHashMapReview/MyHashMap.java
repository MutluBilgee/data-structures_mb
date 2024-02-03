package week2QueueHashMapReview;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    public List<Buckets>hashMap;
    public int modNumber;
    public MyHashMap() {
        this.modNumber=2341;
        this.hashMap=new ArrayList<>();
        for (int i = 0; i < modNumber; i++) {
            this.hashMap.add(new Buckets());
        }
    }
    public void put (int key, int value) {
        //calculate index
        int hashCode=key%modNumber;
        this.hashMap.get(hashCode).update(key, value);//call method(update) from linked list

    }
    public int get(int key) {
        //calculate index
        int hashCode=key%modNumber;
        return this.hashMap.get(hashCode).get(key);
    }
    public void remove(int key) {
        //calculate index
        int hashCode=key%modNumber;
        this.hashMap.get(hashCode).remove(key);
    }
}
