package external;
public class teacher implements resume 
{
	String name,qua,ach;
	int exp;
	
	teacher(String n,String q,String a,int e)
	{
		name=n;
		qua=q;
		ach=a;
		exp=e;
	}
	public void biodata()
	{
		System.out.println("\tname="+name+"\tqua"+qua+"\tach="+ach+"\texp="+exp);
	}
}
