package external;
import java.util.*;
public class teaching extends staff
{
	public String domain;
	public int publication;
	 
	@Override public void read()
	{
		Scanner in =new Scanner(System.in);
		super.read();
		System.out.println("enter domain and publications");
		domain=in.next();
		publication=in.nextInt();
	}
	
	@Override public void disp()
	{
		super.disp();
		System.out.println("\tdomain:"+domain+"\tpublication:"+publication);
	}
}
