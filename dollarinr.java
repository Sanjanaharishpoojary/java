package currencyconverter;
import java.util.*;
public class dollarinr 
{
	float d,r;
	
	public void dtor()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the dollar");
		d=in.nextFloat();
		r=(float)(82.52*d);
		System.out.println("dollar in rupees="+r);
	}
	
	public void rtod()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the rupees");
		r=in.nextFloat();
		d=(float)(0.0121*r);
		System.out.println("rupees in dollae="+d);
	}
}
