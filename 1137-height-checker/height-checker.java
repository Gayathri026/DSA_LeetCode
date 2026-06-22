class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];

        for (int h : heights) {
            freq[h]++;
        }

        int count = 0;
        int currentHeight = 1;

        for (int i = 0; i < heights.length; i++) {

            while (freq[currentHeight] == 0) {
                currentHeight++;
            }

            if (heights[i] != currentHeight) {
                count++;
            }

            freq[currentHeight]--;
        }

        return count;
    }
}