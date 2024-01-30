package sobhan-h007;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("number " + n + " " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
