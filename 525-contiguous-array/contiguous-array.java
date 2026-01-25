class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // prefix sum 0 at index -1
        
        int sum = 0;
        int maxLen = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) sum = sum - 1;
            else sum = sum + 1;
            
            if(map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
