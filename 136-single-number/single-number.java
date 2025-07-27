class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(set1.contains(nums[i])){
                set1.remove(nums[i]);
           } else {
                set1.add(nums[i]);     
            }
        }
       
        return set1.iterator().next();
    }
}