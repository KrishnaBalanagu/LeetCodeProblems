class Solution {
    public int longestConsecutive(int[] nums) {
        //TimeComplexity nLog(n)
        if(nums.length<=1) return nums.length;
        int k = 0;
        int temp = 0;
        TreeSet<Integer> sorted = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            sorted.add(nums[i]);
        }
       Iterator<Integer> iterator = sorted.iterator();
       int length = nums.length;
       int previous = iterator.next();
        while(iterator.hasNext()){
            int currentElement = iterator.next();
            if(currentElement-previous !=1) {
                k = Math.max(temp,k);
                temp = 0;
            }
            else temp++;
            previous = currentElement;
        }
        return Math.max(temp,k)+1;
    }
}