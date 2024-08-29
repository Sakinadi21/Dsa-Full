package SearchInsert;

public class SearchInsert {

    /*
    Given a sorted array of distinct integers and a target value, return the index if the
    target is found. If not, return the index where it would be if it were inserted in order.
    0(nlogn)
    */

        public int searchInsert(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target)
                    return mid;
                if (target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return low; // Return the position where the target should be inserted
        }
    }

