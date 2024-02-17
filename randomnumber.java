package external;
import java.util.*;
public class randomnumber extends Thread
{
	public void run()
	{
		Random in=new Random();
		for(int i=0;i<5;i++)
		{
			int rand=in.nextInt(10);
			System.out.println("random integer:"+rand);
			square s=new square(rand);
			s.start();
			cube c =new cube(rand);
			c.start();
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ae)
			{
				System.out.println(ae);
			}
		}
	}
}
