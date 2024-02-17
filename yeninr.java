package currencyconverter;
import java.util.*;
public class yeninr 
{
		float y,r;
		
		public void ytor()
		{
			Scanner in=new Scanner(System.in);
			System.out.println("enter the yen");
			y=in.nextFloat();
			r=(float)(0.6*y);
			System.out.println("yen in rupees="+r);
		}
		
		public void rtoy()
		{
			Scanner in=new Scanner(System.in);
			System.out.println("enter the rupees");
			r=in.nextFloat();
			y=(float)(1.666*r);
			System.out.println("rupees in yen="+y);
		}
}

