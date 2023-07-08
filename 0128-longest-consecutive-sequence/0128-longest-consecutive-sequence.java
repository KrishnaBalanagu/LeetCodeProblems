class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length<=1) return nums.length;
        //TimeComplexity nLog(n)
       //  int k = 0;
       //  int temp = 0;
       //  TreeSet<Integer> sorted = new TreeSet<>();
       //  for(int i=0;i<nums.length;i++){
       //      sorted.add(nums[i]);
       //  }
       // Iterator<Integer> iterator = sorted.iterator();
       // int length = nums.length;
       // int previous = iterator.next();
       //  while(iterator.hasNext()){
       //      int currentElement = iterator.next();
       //      if(currentElement-previous !=1) {
       //          k = Math.max(temp,k);
       //          temp = 0;
       //      }
       //      else temp++;
       //      previous = currentElement;
       //  }
       //  return Math.max(temp,k)+1;
        //TimeComplexity O(n)
       
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longest = 0;
        for(Integer element: set){
            if(!set.contains(element-1)) longest = Math.max(checkForLongest(set,element),longest) ;
            
        }
        return longest;
        
    }
    public int checkForLongest(Set<Integer> set,int element){
        int count = 1;
        while(set.contains(element+1)){
            count++;
            element++;
        }
        return count;
    }
}