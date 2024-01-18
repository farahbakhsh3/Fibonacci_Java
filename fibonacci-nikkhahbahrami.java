public class FibonacciSequence {
    public static void main(String[] args) {
        int sequenceLength = 10; // You can change 'sequenceLength' to the desired Fibonacci sequence length
        System.out.println("Fibonacci Sequence up to " + sequenceLength + " terms:");
        for (int index = 0; index < sequenceLength; index++) {
            System.out.print(calculateFibonacci(index) + " ");
        }
    }

    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}
