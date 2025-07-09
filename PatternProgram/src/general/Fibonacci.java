package general;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        Map<Integer,Integer> cacheMap = new HashMap<>();
        for(int i = 0; i<=n; i++) {
            System.out.print(fibonacci(i,cacheMap) + " ");
        }
    }

    private static Integer fibonacci(int n, Map<Integer, Integer> cacheMap) {
        if( n <= 1) {
            cacheMap.put(n,n);
            return n;
        }
        int c = 0;
        for(int i = 2; i<=n; i++) {
            c = cacheMap.get(i-1) + cacheMap.get(i-2);
            cacheMap.put(i,c);
        }
        return c;
    }
}
