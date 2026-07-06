class Solution {
    public int rob(int[] nums) {
       int n = nums.length;
       if(n == 1) return nums[0]; 
    int answer = Math.max(helper(nums, 0,n-2) , helper(nums,1,n-1)) ; 
        return answer;        
    }
    private int helper(int[] nums,int left,int right){
         int prevRob = 0;
        int maxRob = 0;

        for (int curValue=left;curValue<=right;curValue++) {
            int temp = Math.max(maxRob, prevRob + nums[curValue]);
            prevRob = maxRob;
            maxRob = temp;
        }
        return maxRob;
    }
}