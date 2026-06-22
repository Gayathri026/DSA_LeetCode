class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] freq = new int[nums.length+1];
        ArrayList<Integer> res = new ArrayList<>();
        int j =0;
        for(int num :nums){
            freq[num]++;
        }
        for(int i =1;i<nums.length+1;i++){
            if(freq[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}