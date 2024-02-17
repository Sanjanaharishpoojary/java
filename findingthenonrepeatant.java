import java.util.*;
public class findingthenonrepeatant 
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		Scanner in=new Scanner(System.in);
		System.out.println("enter the array size");
		int i,f=0,j,n=in.nextInt();
		System.out.println("enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("the non repeating element is");
		Arrays.sort(a);
		for(i=0;i<n;i+=2)
		{
			if(a[i]!=a[i+1])
			{
				System.out.println(a[i]);
				break;
			}
		}
			
	}
}
