
package fibo;

import java.util.HashMap;
import java.util.Map;

class Fibonachi {

    private Map<Long, Long> previousValuesHolder;

    public Fibonachi() {
        this.previousValuesHolder = new HashMap<Long, Long>();
        this.previousValuesHolder.put(Long.valueOf(0), Long.valueOf(0));
        this.previousValuesHolder.put(Long.valueOf(1), Long.valueOf(1));
    }

    public long fibonachi_optimized(long n) {
        if (this.previousValuesHolder.containsKey(Long.valueOf(n))) {
            return this.previousValuesHolder.get(n);
        }

        long newValue = this.fibonachi_optimized(n - 1) + this.fibonachi_optimized(n - 2);
        this.previousValuesHolder.put(Long.valueOf(n), Long.valueOf(newValue));
        return newValue;
    }

    public long fibonachi_standard(int n) {
        if ((n == 0) || (n == 1)) {
            return n;
        }

        return this.fibonachi_standard(n - 1) + this.fibonachi_standard(n - 2);
    }
}
