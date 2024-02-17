package external;
public class staffmain 
{	
	public static void main(String[] args)
	{
		teaching t1=new teaching();
		t1.read();
		t1.disp();
		
		technical t2=new technical();
		t2.read();
		t2.disp();
		
		contract c=new contract();
		c.read();
		c.disp();
	}
}
