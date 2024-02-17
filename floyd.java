import java.util.*;
public class floyd 
{
	public static void main(String []args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter the number of nodes");
		int n=in.nextInt();
		System.out.println("enter the weighted matrix");
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=in.nextInt();
		flyd(a,n);
		System.out.println("the shortest path solution is");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.println(a[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void flyd(int a[][],int n)
	{
		for(int k=0;k<n;k++)
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					a[i][j]=Math.min(a[i][j],a[i][k]+a[k][j]);
	}
}
