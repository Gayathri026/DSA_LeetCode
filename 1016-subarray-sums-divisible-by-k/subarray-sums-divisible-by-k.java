class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int result = 0;
        int prefix = 0;

        for (int num : nums) {
            prefix += num;
            int rem = ((prefix % k) + k) % k;

            result += hm.getOrDefault(rem, 0);
            hm.put(rem, hm.getOrDefault(rem, 0) + 1);
        }
        return result;
    }
}
