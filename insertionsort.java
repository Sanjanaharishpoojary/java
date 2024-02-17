package general;
import java.util.*;
public class insertionsort 
{
	static void insert(int[] a,int n)
	{
		int t,i,j;
		for(i=1;i<n;++i)
		{
			t=a[i];
			j=i-1;
			while(j>=0 && a[j]>t)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=t;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the array size");
		int i,n=in.nextInt();
		int[] a=new int[n];
		Random r=new Random();
		for(i=0;i<n;i++)
			a[i]=r.nextInt(500000);
		insert(a,n);
		for(int c:a)
			System.out.println(c+"");
	}
}
