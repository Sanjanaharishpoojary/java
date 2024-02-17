package internal;
import java.util.*;
public class merge 
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
		mergesort(a,0,n-1);
		long t2=System.nanoTime();
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		System.out.println("time taken:"+(t2-t1));
	}
	public static void mergesort(int a[],int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			merge(a,low,mid ,high);
		}
	}
	
	public static void merge(int a[],int low,int mid,int high)
	{
		int i=low,j=mid+1,k=low;
		int res[]=new int[high+1];
		while(i<=mid&&j<=high)
		{
			if(a[i]<a[j])
				res[k++]=a[i++];
			else
				res[k++]=a[j++];	
		}
		while(i<=mid)
			res[k++]=a[i++];
		while(j<=high)
			res[k++]=a[j++];
		for(int m=low;m<=high;m++)
			a[m]=res[m];
	}
}
