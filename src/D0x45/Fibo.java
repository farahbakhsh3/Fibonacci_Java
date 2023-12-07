package D0x45;

public class Fibo {
    private static long[] fibs = new long[128];
    public static long nth(int i) {
        if (i <= 1 || i >= 127) return (fibs[i < 1 ? 0 : 1] = 1);
        if (fibs[i] != 0) return fibs[i];
        return (fibs[i] = nth(i - 2) + nth(i - 1));
    }
}
