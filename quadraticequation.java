package external;
import java.util.*;
public class qe 
{
	public static void main(String []args)
	{
		float a,b,c,d,r1,r2;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the value of a,b and c");
		a=in.nextFloat();
		b=in.nextFloat();
		c=in.nextFloat();
		d=(b*b)-(4*a*c);
		if(d==0)
		{
			System.out.println("roots are real and equal");
			r1=((-b)/(2*a));
			System.out.println("r1=r2="+r1);
		}
		if(d>0)
		{
			System.out.println("roots are real and distinct");
			r1=(float)(-b+Math.sqrt(d))/(2*a);
			r2=(float)(-b-Math.sqrt(d))/(2*a);
			System.out.println("r1="+r1+"\nr2="+r2);
		}
		if(d<0)
		{
			System.out.println("roots are imaginary");
			r1=-b/(2*a);
			r2=(float)(Math.sqrt(Math.abs(d))/(2*a));
			System.out.println("r1="+r1+"+i"+r2+"\nr2="+r1+"-i"+r2);
		}
	}
}
