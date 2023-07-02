class Solution {
    public int[] rearrangeArray(int[] nums) {
            int[] arr = new int[nums.length];
    int positiveSpace = 0;
    int negativeSpace = 1;
    for(int i=0; i<nums.length; i++){
        if(nums[i]<0) {
            arr[negativeSpace] = nums[i];
            negativeSpace += 2;
        } else {
            arr[positiveSpace] = nums[i];
            positiveSpace += 2;
        }
            
    }
    return arr;
    }
}