class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num :nums){
            sum+=num;
        }
        int n = nums.length;
        int temp_sum = n*(n+1)/2;
        return temp_sum-sum;
    }
}