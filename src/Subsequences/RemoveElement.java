package Subsequences;

public class RemoveElement {

    int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] arr = {1, 0, 3, 0, 3};  // Example array
        int newLength = re.removeElement(arr, 3);

        System.out.println("New length: " + newLength);

        // Print the modified array
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
