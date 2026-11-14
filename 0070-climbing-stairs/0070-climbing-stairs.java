class Solution {
    public int stairs(int i,int n ,int[] dp){
        if(i>n){
            return 0;
        }
        if(i==n){
            return 1;
        }
        if(dp[i]!=-1) return dp[i];
        return dp[i]=stairs(i+1,n,dp) + stairs(i+2,n,dp);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp,-1);
        }
        return stairs(0,n,dp);
    }
}