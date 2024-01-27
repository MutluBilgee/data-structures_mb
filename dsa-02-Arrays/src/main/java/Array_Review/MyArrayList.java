package Array_Review;

import java.util.Arrays;

public class MyArrayList {
    // Define array
    int[] numbers;
    int size;

    public MyArrayList() {
        this.numbers=new int[10];
        this.size=0;
    }
    public MyArrayList(int capacity) {
        this.numbers=new int[capacity];
        this.size=0;
    }

    int[] grow(){
        return Arrays.copyOf(numbers, numbers.length*2);
            //        int[] newArray=new int[numbers.length*2];// %100 grow
            //        for (int i = 0; i < numbers.length; i++) { newArray[i]=numbers[i];}
            //        numbers=newArray;
            //        return numbers;
    }
    void add(int value){
        if(size>= (int) numbers.length*0.75) {
            System.out.println("Before adding " + value +" Size was: " + this.size + " and Length was "+ numbers.length);
            numbers=grow();
            System.out.println("After adding " + value +" new length is: " + numbers.length );
            System.out.println();
        }
        numbers[size++]=value;
    }
    int size(){
        return this.size;
    }
}
