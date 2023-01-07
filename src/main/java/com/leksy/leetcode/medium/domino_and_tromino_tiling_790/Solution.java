package com.leksy.leetcode.medium.domino_and_tromino_tiling_790;

class Solution {

  private static final int MOD = (int) (1e9 + 7);

  public int numTilings(int N) {
    if (N == 1) {
      return 1;
    }
    if (N == 2) {
      return 2;
    }
    long[] dp = new long[N + 1];
    dp[0] = 1;
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i <= N; i++) {
      dp[i] = (dp[i - 1] * 2 + dp[i - 3]) % MOD;
    }
    return (int) dp[N];
  }
}
