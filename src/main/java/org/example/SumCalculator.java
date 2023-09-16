package org.example;

public class SumCalculator {
    public int sum(int n){
        if (n <= 0){
            throw new IllegalArgumentException("n should be > 0");
        }
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result+=i;
            if (result < 0){
                throw new IllegalArgumentException("n is too big");
            }
        }
        return result;
    }
}
