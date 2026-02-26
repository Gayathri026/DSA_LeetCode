class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2;i++){
            for(int j =i+1;j<nums.length-1;j++){
                for(int k = nums.length-1;k>j;k--){
                    int add = nums[i]+nums[j]+nums[k];
                    int dif = Math.abs(target - add);
                    if(dif<min){
                        closest = add;
                        min = dif;
                    }
                }
            }
        }
        return closest;
    }
}