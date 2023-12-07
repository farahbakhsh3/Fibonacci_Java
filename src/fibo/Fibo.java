package fibo;

import java.util.Scanner;

public class Fibo {    
    public static void main(String[] args) {

        Fibonachi fibonachi = new Fibonachi();

        int n = 50;

        long beginTime = System.currentTimeMillis();
        long fibo = fibonachi.fibonachi_standard(n);
        long endTime = System.currentTimeMillis();
        long delta = endTime - beginTime;
        System.out.println("Standard mode :: F(" + n + ") = " + fibo + " ... computed     in " + delta + " milliseconds");
        
        
        beginTime = System.currentTimeMillis();
        fibo = fibonachi.fibonachi_optimized(n);
        endTime = System.currentTimeMillis();
        delta = endTime - beginTime;
        System.out.println("Optimized mode :: F(" + n + ") = " + fibo + " ... computed     in " + delta + " milliseconds");
    }
}
