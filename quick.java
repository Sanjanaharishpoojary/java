package internal;
import java.util.*;
public class quick 
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter n value");
		int n=in.nextInt();
		int a[]=new int[n];
		Random r=new Random();
		for(int i=0;i<n;i++)
			a[i]=r.nextInt(20000);
		long t1=System.nanoTime();
		qsort(a,0,n-1);
		long t2=System.nanoTime();
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		System.out.println("time taken:"+(t2-t1));
	}
	public static void qsort(int a[],int low,int high)
	{
		if(low<high)
		{
			int p=partition(a,low,high);
			qsort(a,low,p-1);
			qsort(a,p+1,high);
		}
	}
	public static int partition(int a[],int low,int high)
	{
		int p=a[low],i=low+1,j=high;
		while(low<high)
		{
			while(a[i]<=p&&i<high)
				i++;
			while(a[j]>p)
				j--;
			if(i<j)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			else
			{
				int t=a[j];
				a[j]=a[low];
				a[low]=t;
				return j;
			}
		}
		return j;
	}
}
