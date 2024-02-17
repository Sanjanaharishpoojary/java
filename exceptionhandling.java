package external;
import java.util.*;
public class exhan 
{
	public static void main(String[] args)
	{
		int a,b,res=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter two numbers");
		a=in.nextInt();
		b=in.nextInt();
		try
		{
			res=a/b;
			System.out.println("result = "+res);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}
}
