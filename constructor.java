package external;
public class cons
{
	int a,b;
	
	public cons()
	{
		a=11;
		b=16;
	}
	
	public cons(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public cons(cons n)
	{
		a=n.a;
		b=n.b;
	}
	
	public void disp()
	{
		System.out.println("a="+a+"\tb="+b);
	}
	
	public static void main(String[] args)
	{
		cons c1= new cons();
		c1.disp();
		cons c2=new cons(3,95);
		c2.disp();
		cons c3=new cons(c2);
		c3.disp();
	}
	
}
