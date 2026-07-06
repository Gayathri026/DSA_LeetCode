class Solution {
    public int deleteAndEarn(int[] nums) {

        int max = 0;

        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] points = new int[max + 1];

        for (int num : nums) {
            points[num] += num;
        }
        int prev = 0;
        int curr = 0;

        for (int point : points) {
            int temp = Math.max(curr, prev + point);
            prev = curr;
            curr = temp;
        }

        return curr;
    }
}