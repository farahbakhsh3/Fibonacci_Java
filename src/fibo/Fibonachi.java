/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 2630856267
 */
class Fibonachi {

    private Map<Long, Long> previousValuesHolder;

    public Fibonachi() {
        this.previousValuesHolder = new HashMap<Long, Long>();
        this.previousValuesHolder.put(Long.valueOf(0), Long.valueOf(1));
        this.previousValuesHolder.put(Long.valueOf(1), Long.valueOf(1));
    }

    public long fibonachi_optimized(long n) {
        if (this.previousValuesHolder.containsKey(Long.valueOf(n))) {
            return this.previousValuesHolder.get(n);
        }

        long newValue = this.fibonachi_optimized(n - 2) + this.fibonachi_optimized(n - 1);
        this.previousValuesHolder.put(Long.valueOf(n), Long.valueOf(newValue));
        return newValue;
    }

    public long fibonachi_standard(int n) {
        if ((n == 0) || (n == 1)) {
            return 1;
        }

        return this.fibonachi_standard(n - 1) + this.fibonachi_standard(n - 2);
    }
}
