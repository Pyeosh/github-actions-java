package kr.ac.hansung;

public class Fibonacci {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Fibonacci <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("Please provide a non-negative integer.");
            return;
        }

        for (int i = 0; i < n; i++) {
            //System.out.print(fibonacci(i) + " ");
            int fib = fibonacci(i);
            System.out.print("fibonacci ("+ i +")= " + fib);
            System.out.println();

        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
