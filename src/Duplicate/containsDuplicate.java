package Duplicate;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        containsDuplicate checker = new containsDuplicate();
        int[] nums = {1, 3, 5, 4, 6};
        System.out.println(checker.containsDuplicate(nums)); // Output: false

        int[] numsWithDuplicates = {1, 3, 5, 4, 6, 3};
        System.out.println(checker.containsDuplicate(numsWithDuplicates)); // Output: true
    }
}



    /*
    nums[][]  | 1 | 3 | 5 | 4 | 6


           /-----------------\
    set   /  6     3     4   |
          |  1    5          |
          \ -----------------/
       */

