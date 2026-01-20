class Solution {
    public long interchangeableRectangles(int[][] rec) {
        
        int i,j,n=rec.length;
        long sum=0;
        Map<Double,Integer> map=new HashMap();
        for(i=0;i<n;i++)
            map.put((double)rec[i][0]/rec[i][1],map.getOrDefault((double)rec[i][0]/rec[i][1],0)+1);
        for(Double key : map.keySet())
            sum+=(long)map.get(key)*(map.get(key)-1)/2;
        return sum;
    }
}