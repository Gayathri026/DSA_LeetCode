class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int nums : arr){
            hm.put(nums, hm.getOrDefault(nums, 0) + 1);
        }
        Set<Integer> mp = new HashSet<>();
        for (Map.Entry<Integer, Integer> e : hm.entrySet()){
           if(mp.contains(e.getValue())){
            return false;
           }
           mp.add(e.getValue());
            }


        return true;
    }
}