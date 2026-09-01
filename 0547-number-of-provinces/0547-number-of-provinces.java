class Solution {
    static int[] parent, size;
    public int leader(int u) {
        if (parent[u] == u) return u;

        return parent[u] = leader(parent[u]);
    }
    public void union(int u, int v) {
        int a = leader(u);
        int b = leader(v);
        if (a == b) return;
        if (size[a] >= size[b]) {
            parent[b] = a;
            size[a] += size[b];
        } else {
            parent[a] = b;
            size[b] += size[a];
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    union(i, j);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (leader(i) == i) {
                count++;
            }
        }
        return count;
    }
}