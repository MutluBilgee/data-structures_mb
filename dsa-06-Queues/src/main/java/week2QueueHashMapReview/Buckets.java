package week2QueueHashMapReview;

import java.util.LinkedList;

public class Buckets {
    LinkedList<KeyValue<Integer, Integer>>bucketList;

    public Buckets() {
        this.bucketList = new LinkedList<KeyValue<Integer, Integer>>();
    }
    public int get(int key){
        for (KeyValue<Integer, Integer>pair:bucketList) {
            if(pair.key.equals(key)){
                return pair.value;
            }
        }
        return -1;//no found return -1
    }
    public void update(int key, int value){//used with put
        boolean found=false;
        for(KeyValue<Integer, Integer>pair:bucketList){
            if(pair.key.equals(key)){
                pair.value=value;
                found=true;
            }
        }
        if(!found) this.bucketList.add(new KeyValue<>(key,value));
    }

    public void remove(int key){
        for(KeyValue<Integer, Integer>pair:bucketList){
            if(pair.key.equals(key)){
                this.bucketList.remove(pair);
                break;
            }
        }
    }
}
