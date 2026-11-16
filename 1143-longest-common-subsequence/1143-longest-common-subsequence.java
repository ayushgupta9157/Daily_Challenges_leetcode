class Solution {
    public int subsequence(String text1,String text2,int[][] dp,int i ,int j){
        if(i<0 || j<0) return 0;
        if(text1.charAt(i)==text2.charAt(j)){
            return 1 + subsequence(text1,text2,dp,i-1,j-1);
        }
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=Math.max(subsequence(text1,text2,dp,i-1,j),subsequence(text1,text2,dp,i,j-1));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return subsequence(text1,text2,dp,m-1,n-1);
    }
}