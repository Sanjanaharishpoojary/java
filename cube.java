package external;
public class cube extends Thread
{
	int x;
	
	cube(int n)
	{
		x=n;
	}
	
	public void run()
	{
		int cube=x*x*x;
		System.out.println("cube is "+cube);
	}
}
