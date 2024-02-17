package external;
import java.util.*;
public class contract extends staff
{
		public int period;
		 
		@Override public void read()
		{
			Scanner in =new Scanner(System.in);
			super.read();
			System.out.println("enter period");
			period=in.nextInt();
		}
		
		@Override public void disp()
		{
			super.disp();
			System.out.println("\tperiod:"+period);
		}
}


