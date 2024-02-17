package external;
public class student implements resume
{
	String name,dis,res;
	
	student(String n,String d,String r)
	{
		name=n;
		dis=d;
		res=r;
	}
	
	public void biodata()
	{
		System.out.println("\tname="+name+"\tdis="+dis+"\tres="+res);
	}
	
}
