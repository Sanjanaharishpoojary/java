package internal;
import java.util.*;
public class selectionsort 
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter n value");
		int n=in.nextInt();
		int a[]=new int[n];
		Random r=new Random();
		for(int i=0;i<n;i++)
			a[i]=r.nextInt(10000);
		long t1=System.nanoTime();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		long t2=System.nanoTime();
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		System.out.println("time taken:"+(t2-t1));
	}
}
