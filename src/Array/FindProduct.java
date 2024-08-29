package Array;

public class FindProduct {

    public int[] findProduct(int[] arr) {
        int temp = 1;
        int[] result = new int[arr.length];

        // Compute the product of all elements to the left of each element
        for (int i = 0; i < arr.length; i++) {
            result[i] = temp;
            temp = temp * arr[i];
        }

        temp = 1;

        // Compute the product of all elements to the right of each element
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = result[i] * temp;
            temp = temp * arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        FindProduct fp = new FindProduct();
        int[] arr = {1, 2, 3, 4};  // Example array
        int[] result = fp.findProduct(arr);

        // Print the result
        System.out.print("Product array: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
