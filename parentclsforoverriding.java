package external;
import java.util.*;
public class staff 
{
	public int staffid;
	public String name;
	public long phn;
	public double salary;
	
	public void read()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the staff details");
		staffid=in.nextInt();
		name=in.next();
		phn=in.nextLong();
		salary=in.nextDouble();
	}
	
	public void disp()
	{
		System.out.println("staffid:"+staffid+"\tname:"+name+"\tphone:"+phn+"\tsalary:"+salary);
	}
}
