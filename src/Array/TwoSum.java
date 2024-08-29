package Array;


    import java.util.Arrays;

    public class TwoSum {

        public static int[] twoSumII(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;
            int[] result = new int[2];

            Arrays.sort(arr); // Sort the array: 0, 2, 6, 7, 10, 11

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == target) {
                    result[0] = arr[left];
                    result[1] = arr[right];
                    return result;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            return new int[0]; // Return an empty array if no pair is found
        }

        public void arrayDemo() {
            int[] arr = {11, 2, 0, 10, 7, 6};
            int[] result = twoSumII(arr, 9);
            printArray(result);
        }

        public void printArray(int[] arr) {
            if (arr.length == 0) {
                System.out.println("No pair found.");
            } else {
                System.out.println("Pair found: " + arr[0] + ", " + arr[1]);
            }
        }

        public static void main(String[] args) {
            TwoSum demo = new TwoSum();
            demo.arrayDemo();
        }
    }


