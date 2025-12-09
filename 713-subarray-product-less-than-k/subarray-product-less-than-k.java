class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1;
        int count = 0;
        int i ,j;
        for(i = 0;i<nums.length;i++){
            if(nums[i]<k)count++;
            product *= nums[i];
            for(j=i+1;j<nums.length;j++){
                product *= nums[j];
                if(product < k )count++;
                else{product =1;break;}
            
            }
            product = 1;
            
        }
        return count;
    }
}