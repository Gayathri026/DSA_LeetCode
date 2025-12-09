class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int result =0;
        int prefix = 0;
        for(int num : nums){
            prefix+=num;
            if(hm.containsKey(prefix-k)){
                result += hm.get(prefix-k);
            }
            hm.put(prefix,hm.getOrDefault(prefix,0)+1);
        }
        return result;
    }
}