import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by giraffissimo on 10/26/2018.
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 *   You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 *       Example:
 *
 *          Given nums = [2, 7, 11, 15], target = 9,
 *
 *           Because nums[0] + nums[1] = 2 + 7 = 9,
 *           return [0, 1].
 */
class Solution {

    // Solution #1
    public static String twoSum(int[] nums, int target) {
        int search = 0;
        for(int i = 0; i < nums.length; i++){
                search = target - nums[i];
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] == search) {
                        return "{ " + i + ", " + j + " }";
                    }
                }
        }
        return "The array does not contain required numbers";
    }

    // Solution #2
    public static String twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            Integer search = target - nums[i];
            if(numMap.containsKey(search)) {
                return "{ " + numMap.get(search) + ", " + i + " }";
            } else {
                numMap.put(nums[i], i);
            }
        }

        return "The array does not contain required numbers";
    }


    public static void main(String[] args) {

        int[] nums = new int[]{3,2,95,4,-3};
        int target = 92;
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Required indexes: " + twoSumMap(nums, target));
    }
}
