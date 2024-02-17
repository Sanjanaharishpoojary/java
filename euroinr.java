package currencyconverter;
import java.util.*;
public class euroinr
{
		float e,r;
		
		public void etor()
		{
			Scanner in=new Scanner(System.in);
			System.out.println("enter the euro");
			e=in.nextFloat();
			r=(float)(86.96*e);
			System.out.println("euro in rupees="+r);
		}
		
		public void rtoe()
		{
			Scanner in=new Scanner(System.in);
			System.out.println("enter the rupees");
			r=in.nextFloat();
			e=(float)(0.0114*r);
			System.out.println("rupees in euro="+e);
		}
}
