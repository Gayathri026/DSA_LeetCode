class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int count = 1;  
            int j = i + 1;

            while (j < n) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                j++;
            }

            if (count > n / 2) {
                return nums[i]; 
            }
            i++;
        }
        return -1; 
    }
}
