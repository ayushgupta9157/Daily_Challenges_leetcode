class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        int ans = 0;
        int max = Integer.MIN_VALUE;
        while (!q.isEmpty()) {
            level++;
            int sum = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            if (sum > max) {
                max = sum;
                ans = level;
            }
        }
        return ans;
    }
}