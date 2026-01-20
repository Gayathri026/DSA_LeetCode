class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count =0;
        HashMap <Integer, Integer>check = new HashMap<>(); 
        for(int num : nums2){
            check.put(num, check.getOrDefault(num, 0)+1);
        }
        for(int num : nums1){
            for (int d = 1; d*d <= num; d++) {
                if (num%d == 0) {
                    if (d%k == 0 && check.containsKey(d/k)) {
                        count += check.get(d/k);
                    }
                    int other = num/d;
                    if (other!=d && other % k==0 && check.containsKey(other/k)) {
                        count += check.get(other/k);
                    }
                }
            }
        }
        return count;
    }
}