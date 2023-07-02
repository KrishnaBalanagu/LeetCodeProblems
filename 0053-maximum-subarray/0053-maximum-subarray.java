class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
         for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]); // Choose between starting a new subarray or extending the current one
            max = Math.max(max, sum); // Update the maximum subarray sum
        }
        return max;
    }
}