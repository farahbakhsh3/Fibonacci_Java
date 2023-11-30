package fibo;

import java.util.Scanner;

public class Fibo {

    static long fibonachi(int n) {
        if ((n == 0) || (n == 1)) {
            return 1;
        }

        return fibonachi(n - 1) + fibonachi(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = input.nextInt();

        if (n < 0) {
            System.err.print("Wrong n.");
            return;
        }
        System.out.format("fibonachi(%d) = %d\n", n, fibonachi(n));
    }
}
