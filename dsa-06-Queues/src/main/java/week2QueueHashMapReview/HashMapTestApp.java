package week2QueueHashMapReview;

public class HashMapTestApp {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put(1,1);
        myHashMap.put(2,2);
        myHashMap.put(3,3);
        myHashMap.put(3,25);

        System.out.println(myHashMap.get(3));

        myHashMap.remove(1);
        System.out.println(myHashMap.get(1));

        myHashMap.put(2,0);
        System.out.println(myHashMap.get(2));

        myHashMap.put(1500,3);
        System.out.println(myHashMap.get(1500));

        System.out.println(myHashMap.get(2000));

    }
}
