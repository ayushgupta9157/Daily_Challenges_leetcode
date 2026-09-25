class Solution {
    static int ans = 0;
    public int[] dfs(TreeNode root){
        if(root == null) return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,0,1};
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int lmin = left[0] , lmax = left[1] , lsum = left[2],lbst=left[3];
        int rmin = right[0] , rmax = right[1] , rsum =right[2],rbst=right[3];
        if(lbst ==1 && rbst ==1 && root.val > lmax  && root.val<rmin){
            int curr_sum = root.val + lsum + rsum;
            ans = Math.max(ans , curr_sum);
            int min_value = Math.min(lmin , root.val);
            int max_value = Math.max(rmax , root.val);
            return new int[]{min_value , max_value , curr_sum,1} ;
        }
        return new int[]{0,0,0,0};
    }
    public int maxSumBST(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }
}