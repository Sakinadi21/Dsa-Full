package TimeDemo;

public class TimeComplexityDemo {
    public static void main(String[] args) {
        // Record start time
        double startTime = System.currentTimeMillis();

        TimeComplexityDemo demo = new TimeComplexityDemo();

        // Call the findSum method and print the result
        System.out.println(demo.findSum(99999));

        // Record end time
        double endTime = System.currentTimeMillis();

        // Calculate and print the time taken
        System.out.println("Time taken = " + (endTime - startTime) + " milliseconds.");
    }

    // O(1) time complexity: Sum of first n natural numbers
    public int findSum(int n) {
        return n * (n + 1) / 2;
    }

    /* Uncomment this if you want to use a different implementation
    O(n) time complexity: Sum of first n natural numbers using a loop
    public int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    */
}
