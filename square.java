package external; 
public class square extends Thread
{
	int x;
	
	square(int n)
	{
		x=n;
	}
	
	public void run()
	{
		int sq=x*x;
		System.out.println("square  is "+sq);
	}
}
