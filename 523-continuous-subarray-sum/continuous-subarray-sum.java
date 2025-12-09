class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> rMap = new HashMap<>();
        int sum = 0;
        rMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) sum %= k;
            if (rMap.containsKey(sum)) {
                if (i - rMap.get(sum) > 1) 
                    return true;
            } else {
                rMap.put(sum, i);
            }
        }
      
        return false;
    }
}