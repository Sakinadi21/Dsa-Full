package Kadanes;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static int[] twoSum(int[] numbers,int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<numbers.length; i++){
            if(!map.containsKey(target-numbers[i])){
                map.put(numbers[i],i);
            }
            else{
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;


                }
            }
        throw new IllegalArgumentException("Two numbers not found");
        }

    public static void main(String[] args) {
        int[] numbers = new int[] {2,11,5,10,7,8};
        int[]result = twoSum(numbers,9);
        System.out.println("The two indices are = "+result[0] + "and"+result[1]);
    }
    }

