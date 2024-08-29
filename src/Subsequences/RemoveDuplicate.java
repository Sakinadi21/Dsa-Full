package Subsequences;

public class RemoveDuplicate {

    int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j - 1] != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicate rd = new RemoveDuplicate();
        int[] arr = {1, 1, 2, 2, 3};  // Example array with duplicates
        int newLength = rd.removeDuplicates(arr);

        System.out.println("New length: " + newLength);

        // Print the modified array
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
