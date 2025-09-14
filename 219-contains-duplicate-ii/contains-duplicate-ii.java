class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int num = nums[i];
            if(hm.containsKey(num)){
                int diff = hm.get(num);
                if(i-diff <= k)return true;
                else{
                    hm.put(num,i);
                }

            }
            hm.put(num,i);
        }
        return false;
        
    }
}