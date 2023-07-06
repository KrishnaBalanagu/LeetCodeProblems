class Solution {
    public int majorityElement(int[] nums) {
        int majoritySize = nums.length/2;
        //most voting algorithm
        int count =1;
        int element = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] == element) count++;
            else if(count ==0) {
                element = nums[i];
                count = 1;
                }
            else count--;
        }
        return element;
    }
}

// count =3, elemnt = 6
// count =2
// count = 1