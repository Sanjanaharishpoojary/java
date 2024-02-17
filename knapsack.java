package internal;
import java.util.*;
public class knapsack 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter how many weights and knapsack capacity");
		int n=in.nextInt();
		int m=in.nextInt();
		double a[][]=new double[3][n];
		System.out.println("enter profit and weights");
		for(int i=0;i<n;i++)
		{
			a[0][i]=in.nextDouble();
			a[1][i]=in.nextDouble();
			a[2][i]=a[0][i]/a[1][i];
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[2][i]<a[2][j])
				{
					for(int k=0;k<3;k++)
					{
					double t=a[k][i];
					a[k][i]=a[k][j];
					a[k][j]=t;
					}
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(i+"\t"+a[0][i]+"\t"+a[1][i]+"\t"+a[2][i]);
		int k=0;
		double sum=0;
		while(m>0)
		{
			if(a[1][k]<m)
			{
				sum+=a[0][k];
				m-=a[1][k];
			}
			else
			{
				sum+=m*a[2][k];
				m=0;
			}
			k++;
		}
		System.out.print("sum="+sum);
	}

}
