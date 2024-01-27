package algo_analysis_review_codes;

public class RateOfGrowth {
    public static void main(String[] args) {
        int n=100000;
        System.out.println("Input size n is = "+ n);
        solution1(n);
        solution2(n);
        solution3(n);
        solution4(n);
        solution5(n);
    }

    static void solution1(int dataSize){
        long numberOfOperations=0;
        int n=dataSize;// size of  Data

        long startTime;
        long endTime;
        startTime=System.currentTimeMillis();
        for (int i = 0; i < n ; i++) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Solution 1 with single loop: Runtime Results:");
        System.out.println( "Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");


    }
    static void solution2(int dataSize){
        long numberOfOperations=0;
        int n=dataSize;// size of  Data
        long startTime;
        long endTime;
        numberOfOperations=0;
        // Task 2 Nested Loops...................
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n ; i++) {
                numberOfOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println("Solution 2 with nested loops: Runtime Results:");
        System.out.println( "Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");
    }
    static void solution3(int dataSize){
        long numberOfOperations=0;
        int n=dataSize;// size of  Data
        long startTime;
        long endTime;
        numberOfOperations=0;

        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n ; i++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations+=1;
                }
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("Solution 3 with Triple Nested Loops: Runtime Results:");
        System.out.println( "Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");

    }
    static void solution4(int dataSize){
        long numberOfOperations=0;
        int n=dataSize;// size of  Data
        long startTime;
        long endTime;
        numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int i = 1; i < n ; i*=2) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Solution 4 with Logarithmic loop: Runtime Results:");
        System.out.println( "Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");

    }
    static void solution5(int dataSize){
        long numberOfOperations=0;
        int n=dataSize;// size of  Data
        long startTime;
        long endTime;
        numberOfOperations=0;
        int a=1;

        startTime=System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            a*=2;
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Solution 5 with Constant comlexity: Runtime Results:");
        System.out.println( "Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");

    }
}
