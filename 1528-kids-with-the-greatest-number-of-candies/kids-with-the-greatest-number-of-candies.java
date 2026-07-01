class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = 0;
    for(int num :candies){
        max = Math.max(max,num);
    }
       List<Boolean> result =new ArrayList<>();
        for(int ele:candies)
        {
            result.add(ele+extraCandies>=max);
        }
        return result;
    }
}