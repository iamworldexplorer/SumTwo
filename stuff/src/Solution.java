/**
 * Created by giraffissimo on 10/26/2018.
 *
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
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int search = 0;
        for(int i = 0; i < nums.length; i++){
                search = target - nums[i];
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] == search) {
                        result = new int[]{i, j};
                        return result;
                    }
                }
        }
        return result;
    }


    public static void main(String[] args) {

        //System.out.println();
        int[] nums = new int[]{3,2,95,4,-3};
        int target = 92;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
