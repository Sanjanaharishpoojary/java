package external;
import java.util.*;
public class method
{
	public static int mul(int a,int b)
	{
		return(a*b);
	}
	
	public static float mul(float x,float y)
	{
		return(x*y);
	}
	
	public static void main(String[] args)
	{
		int a,b,c;
		float x,y,z;
		Scanner in=new Scanner(System.in);
		System.out.println("enter two integers");
		a=in.nextInt();
		b=in.nextInt();
		c=mul(a,b);
		System.out.println(a+"*"+b+"="+c);
		System.out.println("enter two float numbers");
		x=in.nextFloat();
		y=in.nextFloat();
		z=mul(x,y);
		System.out.println(x+"*"+y+"="+z);
	}
}
