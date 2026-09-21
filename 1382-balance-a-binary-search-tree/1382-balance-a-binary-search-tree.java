class Solution {
    public TreeNode solve(int start,int end,List<Integer> list){
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = solve(start, mid - 1,list);
        root.right = solve(mid + 1, end,list);
        return root;
    }
    public void inorder(TreeNode root,List<Integer> list){
        if(root==null) return ;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        
        return solve(0,list.size()-1,list);
        
    }
}