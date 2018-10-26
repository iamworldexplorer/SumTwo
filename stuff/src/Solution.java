/**
 * Created by giraffissimo on 10/26/2018.
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
