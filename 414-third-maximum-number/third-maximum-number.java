class Solution {
    public int thirdMax(int[] nums) {
        Long max = null;
        Long smax = null;
        Long tmax = null;

        for (int num : nums) {

            if ((max != null && num == max) ||
                (smax != null && num == smax) ||
                (tmax != null && num == tmax))
                continue;

            if (max == null || num > max) {
                tmax = smax;
                smax = max;
                max = (long) num;
            }
            else if (smax == null || num > smax) {
                tmax = smax;
                smax = (long) num;
            }
            else if (tmax == null || num > tmax) {
                tmax = (long) num;
            }
        }

        return tmax == null ? max.intValue() : tmax.intValue();
    }
}