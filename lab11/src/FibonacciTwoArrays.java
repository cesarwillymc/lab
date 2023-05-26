public class FibonacciTwoArrays {

    private static int counter = 0;

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int[] memo = new int[]{0, 1};
        for (int i = 2; i <= n; i++) {
            counter++;
            int temp = memo[1];
            memo[1] = memo[0] + memo[1];
            memo[0] = temp;
        }

        return memo[1];
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println("The Fibonacci number for " + n + " is " + fib(n));
        System.out.println("The number of recursive calls made is " + counter);
    }

}
