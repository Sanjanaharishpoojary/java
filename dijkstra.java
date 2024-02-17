package internal;
import java.util.*;
public class dijkstra
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of nodes");
		int n=in.nextInt();
		int c[][]=new int[n][n];
		System.out.println("enter the weighted matrix");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				c[i][j]=in.nextInt();
		System.out.println("enter source node");
		int s=in.nextInt();
		dijkstra d=new dijkstra();
		d.dij(c,s,n);
	}
	public static void dij(int c[][],int s,int n)
	{
		int vis[]=new int[n];
		int dis[]=new int[n];
		for(int i=0;i<n;i++)
			dis[i]=Integer.MAX_VALUE;
		dis[s]=0;
		for(int i=0;i<n;i++)
		{
			int min=Integer.MAX_VALUE,u=0;
			for(int j=0;j<n;j++)
			{
				if(vis[j]==0&&dis[j]<min)
				{
					min=dis[j];
					u=j;
				}
			}
			vis[u]=1;
			for(int v=0;v<n;v++)
			{
				if(vis[v]==0&&c[u][v]!=0&&dis[u]+c[u][v]<dis[v])
					dis[v]=dis[u]+c[u][v];
			}
		}
		for(int i=0;i<n;i++)
		System.out.printf("the distance from %d to %d is %d%n",s,i,dis[i]);
	}
}
