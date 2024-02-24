package Review_Sorting;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class LetterCandlesProblem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter # Letters :N");
        int n= obj.nextInt();
        System.out.println("Enter # Letters that can be removed :M");
        int m= obj.nextInt();

        System.out.println("Enter letter string in lowercase");
        String str= obj.next();
        System.out.println("You have entered: "+str);
        System.out.println(letterCandlesCost(n, m, str));

    }
    public static int letterCandlesCost(int letterCount, int m,String str){
        // create a map for counts/freqs
        Map<Character,Integer> map=new HashMap<>();

        int count=0;
        int cost=0;
        // count number of chars
        for (Character ch:str.toCharArray()) {
            if (map.containsKey(ch)) {
                count= map.get(ch);
                map.put(ch, count+1);
            } else map.put(ch,1);
        }
        // sort values in hashmap and put in an arraylist
        List<Integer> letterFreq=map.values().stream().sorted((o1,o2)->o2.compareTo(o1)).collect(toList());
        // optimize cost
        int index=0;
        while(m>0 && index<=letterFreq.size()-1){
            if (letterFreq.size()==1){
                letterFreq.set(index, letterFreq.get(index)-1);
                m--;
            } else if(letterFreq.get(index)>=letterFreq.get(index+1)) {
                letterFreq.set(index, letterFreq.get(index)-1);
                m--;
            } else index++;
        }
        // calculate cost and return it
        for (Integer num:letterFreq
             ) {
            cost+=num*num;
        }
       return cost;
    }
}
