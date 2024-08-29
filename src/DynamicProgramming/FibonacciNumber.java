package DynamicProgramming;

public class FibonacciNumber {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public int fib(int[] memo,int n){
        if(memo[n] == 0){
            if(n<2){
                memo[n]=n;
            }
            else {
                int left = fib(memo,n-1);
                int right = fib(memo,n-2);
                memo[n] = left + right;
            }
        }
        return memo[n];
    }

    public static void main(String[] args) {
        FibonacciNumber fb = new FibonacciNumber();
        System.out.println("The 6th fibonacci number is = " + fb.fib(6));
        // 0,1,1,2,3,5,8
    }
}
