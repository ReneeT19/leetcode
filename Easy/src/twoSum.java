import java.util.Arrays;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

public class twoSum {

    public static void main(String[] args) {
        getTwoSum ob = new getTwoSum();
        int[] nums = {2,7,11,15};
        int[] nums2 = {3,2,4};
        int[] nums3 = {3,3};
        System.out.println(Arrays.toString(ob.twoSum(nums,9)));
        System.out.println(Arrays.toString(ob.twoSum(nums2,6)));
        System.out.println(Arrays.toString(ob.twoSum(nums3,6)));
    }

    static class getTwoSum {

        public int[] twoSum(int[] nums, int target) {
//        int[] outcome = new int[2];   //if need to return values instead of index
            int[] index = new int[2];
            for(int i = 0; i < nums.length; i++) {
                for(int j = i+1; j < nums.length; j++) {
                    if(nums[i] + nums[j] == target) {
//                    outcome[0] = nums[i];
//                    outcome[1] = nums[j];
                        index[0] = i;
                        index[1] = j;
                        return index;
//                    return outcome;
                    }
                }
            }
            return null;
        }
    }
}


