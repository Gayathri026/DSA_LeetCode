class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i : nums){
            if(hs.contains(i)){
                return true;
            }
           hs.add(i);
        }
        return false;
    }
}