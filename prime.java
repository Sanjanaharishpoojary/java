package external;
import java.util.*;
public class prime 
{
	public static void main(String[] args)
	{
		int x,i,f=0;
		Scanner in =new Scanner(System.in);
		System.out.println("enter the number");
		x=in.nextInt();
		for(i=2;i<x;i++)
		{
			if(x%i==0)
				f++;
		}
		if(f==0)
			System.out.println(x+" is a prime number");
		else
			System.out.println(x+" is not a prime");
	}
}
