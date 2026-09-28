class Solution {
    static long total =0;
    static long ans =0;
    public void dfs(TreeNode root){
        if(root==null) return ;
        dfs(root.left);
        dfs(root.right);
        total = total + root.val;
    }
    public long solve(TreeNode root){
        if(root==null ) return 0;
        long left = solve(root.left);
        long right = solve(root.right);
        long sum = root.val + left + right ; 
        ans = Math.max(ans,(total-sum)*sum);
        return sum;

    }
    public int maxProduct(TreeNode root) {
        total = 0;
        ans = 0;
        dfs(root);
        solve(root);
        return (int)(ans % 1000000007);
    }
}