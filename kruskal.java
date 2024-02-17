import java.util.*;

class Edge 
{
    int src;
    int dest;
    double wt;

    public Edge(int src, int dest, double wt) 
    {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }
}

public class kruskal 
{
    public static void main(String[] args) 
    {
    	Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of nodes and edges in the graph: ");
        int v = in.nextInt();
        int e = in.nextInt();

        Edge[] edges = new Edge[e];
        System.out.println("Enter the source node, destination node, and cost of all the edges:");
        for (int i = 0; i < e; i++) 
        {
            int src = in.nextInt();
            int dest = in.nextInt();
            double wt = in.nextDouble();
            edges[i] = new Edge(src, dest, wt);
        }

        Arrays.sort(edges, Comparator.comparingDouble(edge -> edge.wt));

        int[] p = new int[v];
        int[] rank = new int[v];
        Arrays.fill(p, -1);

        Edge[] mst = new Edge[v - 1];
        int mstCount = 0;

        for (Edge edge : edges) {
            int i = findRoot(p, edge.src);
            int j = findRoot(p, edge.dest);

            if (i != j) {
                mst[mstCount++] = edge;
                union(p, rank, i, j);
            }
        }
        System.out.println("Minimum Spanning Tree Edges:");
        for (Edge edge : mst) 
            System.out.println("(" + edge.src + " - " + edge.dest + ") Wt: " + edge.wt);
        in.close();
    }

    private static int findRoot(int[] p, int v) {
        if (p[v] == -1)
            return v;
        return findRoot(p, p[v]);
    }

    private static void union(int[] p, int[] rank, int i, int j) {
    	if(i<j)
    		p[i]=j;
    	else
    		p[j]=i;
    }
}
