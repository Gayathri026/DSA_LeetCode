class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }

        return helper(n - 1, amount, coins, dp);
    }

    private int helper(int ind, int t, int[] coins, int[][] dp) {
        if (ind == 0) {
            return (t % coins[0] == 0) ? 1 : 0;
        }

        if (dp[ind][t] != -1)
            return dp[ind][t];

        int notTake = helper(ind - 1, t, coins, dp);

        int take = 0;
        if (coins[ind] <= t)
            take = helper(ind, t - coins[ind], coins, dp);

        return dp[ind][t] = notTake + take;
    }
}