public class Fibonacci {

    private static int counter = 0;


    public static int fib(int n) {
        counter++;
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1)+fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println("The Fibonacci number for " + n + " is " + fib(n));
        System.out.println("The number of recursive calls made is " + counter);
    }

}
