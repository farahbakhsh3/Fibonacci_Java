package aPartovii;

import java.util.HashMap;

class Fibonacci
{
    public HashMap<Integer, Long> fibs;

    public Fibonacci()
    {
        this.fibs = new HashMap<Integer, Long>();
        this.fibs.put(0, (long)1);
        this.fibs.put(1, (long)1);
    }

    public long get_n(int n)
    {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return this.get_n(n - 1) + this.get_n(n - 2);
    }

    public long better_fibo(int n)
    {
        if (this.fibs.containsKey(n)) {
            return this.fibs.get(n);
        }
        long fib_n = this.get_n(n - 1) + this.get_n(n - 2);
        this.fibs.put(n, fib_n);
        return fib_n;
    }
}
