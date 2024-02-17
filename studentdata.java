package external;
import java.util.*;
public class prog2 
{
	private String usn;
	private String name;
	private String branch;
	private long phn;
	
	public void read()
	{
		Scanner in = new Scanner(System.in);
		name=in.next();
		usn=in.next();
		branch=in.next();
		phn=in.nextLong();
	}
	
	public void disp()
	{
		System.out.println(name+"\t"+branch+"\t"+usn+"\t"+phn);
	}
	
	public static void main(String[] args)
	{
		int i,n;
		Scanner in = new Scanner(System.in);
		System.out.println("enter how many students");
		n=in.nextInt();
		prog2 S[]= new prog2 [n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter"+(i+1)+"student's info");
			S[i]=new prog2();
			S[i].read();
		}
		
		System.out.println("name\tbranch\tusn\tphn");
		for(i=0;i<n;i++)
			S[i].disp();
		
	}
}
