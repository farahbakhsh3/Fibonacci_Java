package fibo;

public class Fibo {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        int n = 10;

        long beginTime = System.currentTimeMillis();
        long fibo = fibonacci.fibonacci_standard(n);
        long endTime = System.currentTimeMillis();
        long delta = endTime - beginTime;
        System.out.println("Standard mode :: F(" + n + ") = " + fibo + " ... computed     in " + delta + " milliseconds");

        beginTime = System.currentTimeMillis();
        fibo = fibonacci.fibonacci_optimized(n);
        endTime = System.currentTimeMillis();
        delta = endTime - beginTime;
        System.out.println("Optimized mode :: F(" + n + ") = " + fibo + " ... computed     in " + delta + " milliseconds");
    }
}
