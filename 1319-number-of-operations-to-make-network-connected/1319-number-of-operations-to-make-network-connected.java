class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int i) {
        visited[i] = true;
        for(int x : adj.get(i)) {
            if(!visited[x]) {
                dfs(adj, visited, x);
            }
        }
    }
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1) {
            return -1;
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < connections.length; i++) {
            int u = connections[i][0];
            int v = connections[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(adj, visited, i);
                count++;
            }
        }
        return count - 1;
    }
}