class Solution {
    public int maxSubArray(int[] nums) {
       int max = Integer.MIN_VALUE;
       int c = 0;
       for(int num:nums){
        c += num;
        
        max = Math.max(c,max);
        if(c<0){
            c =0;
        }
       } 
       return max;
    }
}