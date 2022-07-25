import java.util.HashMap;
import java.util.Map;

public class Run {

    public static void main(String[] args) {
        elapsedTime();

        System.out.println("" + fib(30));

    }

    public static void elapsedTime() {
        long t1, t2;
        t1 = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            fib(11);
        }
        t2 = System.nanoTime();
        System.out.println("Running time = " + ((t2 - t1) / 1000000) + "ms");
    }

    static Map<Long, Long> m = new HashMap<>();

//    public static long fib(long n) {
//        m.put(1l, 1l);
//        m.put(2l, 1l);
//        if (!m.containsKey(n)) {
//            m.put(n, (fib(n - 1) + fib(n - 2)));
//        }
//        return m.get(n);
//    }

//    public static long fib(long n) {
//        long previousFib = 1, currentFib = 1;
//        for (int i = 1; i < n - 1; i++) {
//            long newFib = previousFib + currentFib;
//            previousFib = currentFib;
//            currentFib = newFib;
//        }
//        return currentFib;
//    }

//    public static long fib(long n) {
//        // TODO: Calculate Fibonacci value for the given number
//        if (n < 0) {
//            return -1;
//        } else if (n == 0 || n == 1) {
//            return n;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }
//    }

    public static long fib(int n) {
        // TODO: Calculate Fibonacci value for the given number
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }


}
