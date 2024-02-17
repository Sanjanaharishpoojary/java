package external;
import java.util.*;
public class technical extends staff 
{
		public String skill;
		 
		@Override public void read()
		{
			Scanner in =new Scanner(System.in);
			super.read();
			System.out.println("enter skills");
			skill=in.next();
		}
		
		@Override public void disp()
		{
			super.disp();
			System.out.println("\tskill:"+skill);
		}
}

