package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;  // Import the Stack class

public class Graphh {
    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public Graphh(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);  // because it is an undirected graph
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + " : ");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");

            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
        System.out.println();  // Move to the next line after BFS output
    }

    public void dfs(int s) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {
            int u = stack.pop();

            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");

                // Push adjacent vertices in reverse order to maintain the correct order in DFS
                for (int i = adj[u].size() - 1; i >= 0; i--) {
                    int v = adj[u].get(i);
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
        System.out.println();  // Move to the next line after DFS output
    }

    public static void main(String[] args) {
        Graphh g = new Graphh(4);  // Corrected object creation
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.println(g);
        g.bfs(0);
        g.dfs(0);  // Added DFS method call
    }
}
