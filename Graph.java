
import java.util.*;

public class Graph {
    private LinkedList<Integer> adj[];

    public Graph(int v) {
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();

        }
    }

    public void addEdge(int src, int dst) {
        adj[src].add(dst);
        adj[dst].add(src);
    }

    public int bfs(int src, int dst) {
        Queue<Integer> q = new LinkedList<>();
        int parent[] = new int[adj.length];
        boolean vis[] = new boolean[adj.length];
        q.add(src);
        vis[src] = true;
        parent[src] = -1;
        while (!q.isEmpty()) {
            int curr = q.poll();
            if (curr == dst)
                break;
            for (int neighbour : adj[curr]) {
                if (!vis[neighbour]) {
                    q.add(neighbour);
                    vis[neighbour] = true;
                    parent[neighbour] = curr;
                }
            }
        }
        int curr = dst;
        int dist = 0;
        while (parent[curr] != -1) {
            System.out.print(curr + " =>");
            curr = parent[curr];
            dist++;
        }
        System.out.print(curr);
        return dist;
    }

    public boolean dfs(int src, int dst) {
        Stack<Integer> stack = new Stack<>();
        boolean vis[] = new boolean[adj.length];
        stack.push(src);
        vis[src] = true;
        System.out.println("DFS Visiting...");
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            System.out.print(curr + " =>");

            vis[curr] = true;
            if (curr == dst)
                return true;
            for (int neighbour : adj[curr]) {
                if (!vis[neighbour]) {
                    stack.push(neighbour);
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices and edges: ");
        int v = sc.nextInt();
        int e = sc.nextInt();
        Graph graph = new Graph(v);
        System.out.println("Enter " + e + " edges: ");
        int src, dst;
        for (int i = 0; i < e; i++) {
            src = sc.nextInt();
            dst = sc.nextInt();
            graph.addEdge(src, dst);
            System.out.println();
        }
        System.out.println("Enter starting point and ending point: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(" The min dist is " + graph.bfs(start, end));
        boolean answer = graph.dfs(start, end);
        System.out.println("possible " + answer);
    }
}