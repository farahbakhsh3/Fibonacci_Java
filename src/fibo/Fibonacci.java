
package fibo;

import java.util.HashMap;
import java.util.Map;

class Fibonacci {

    private Map<Long, Long> previousValuesHolder;

    public Fibonacci() {
        this.previousValuesHolder = new HashMap<Long, Long>();
        this.previousValuesHolder.put(Long.valueOf(0), Long.valueOf(0));
        this.previousValuesHolder.put(Long.valueOf(1), Long.valueOf(1));
    }

    public long fibonacci_optimized(long n) {
        if (this.previousValuesHolder.containsKey(Long.valueOf(n))) {
            return this.previousValuesHolder.get(n);
        }

        long newValue = this.fibonacci_optimized(n - 1) + this.fibonacci_optimized(n - 2);
        this.previousValuesHolder.put(Long.valueOf(n), Long.valueOf(newValue));
        return newValue;
    }

    public long fibonacci_standard(int n) {
        if ((n == 0) || (n == 1)) {
            return n;
        }

        return this.fibonacci_standard(n - 1) + this.fibonacci_standard(n - 2);
    }
}
