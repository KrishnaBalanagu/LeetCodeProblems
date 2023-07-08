class Solution {
    public void nextPermutation(int[] nums) {
      //find the first adacent pair from right side where left is smaller than right
      //if you dont find such a pair, reverse the whole array
      //swap the left element with the smallest element greater than the that to its right
      //then reverse the sub array from the point of swap till the end
      Boolean foundPair = false;
      for(int i=nums.length-1;i>0;i--){
          if(nums[i] > nums[i-1]){
              foundPair = true;
              int smallestGreaterIndex = i;
                  for (int j = i + 1; j < nums.length; j++) {
                      if (nums[j] > nums[i - 1] && nums[j] <= nums[smallestGreaterIndex]) {
                          smallestGreaterIndex = j;
                        }
                   }
              swap(nums, i - 1, smallestGreaterIndex);
              reverseArray(i,nums.length-1,nums);
              break;
          }
      }
      if(!foundPair) reverseArray(0,nums.length-1,nums);

        
    }
    public void reverseArray(int start, int end, int[] nums){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
        
    }
    public void swap(int[] nums,int i,int j){
         int temp = nums[i];
         nums[i] = nums[j];
         nums[j] = temp;
    }
}
