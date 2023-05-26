public class FibonacciMemo {

    private static int counter = 0;

    public static Integer Fib(int n){
        Integer[] arr= new Integer[n+1];
        for (int i=0;i<=n;i++){
            arr[i]=-1;
        }
        return memoizedFib(n,arr);

    }
    public static int memoizedFib(int n, Integer[] arr) {
        counter++;
        if (arr[n] < 0) {
            if (n == 0) return 0;
            else if (n == 1) return 1;
            else arr[n] = memoizedFib(n - 2, arr) + memoizedFib(n - 1, arr);
        }
        return arr[n];

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("The Fibonacci number for " + n + " is " + Fib(n));
        System.out.println("The number of recursive calls made is " + counter);
    }

}
