
package Subsequences;

public class Element {
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
        Element el = new Element();
        int[] arr = {1, 3, 5, 3, 5};  // Example array
        int newLength = el.removeElement(arr, 5);
        System.out.println("New length: " + newLength);

        // Print the modified array
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
