package external;
import java.util.*;
import java.lang.*;
public class calculator
{
	public static void main(String[] args)
	{
		int a,b,op,res=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the operands");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("enter the operator");
		op=in.next().charAt(0);
		switch(op)
		{
			case '+':res=a+b;
					break;
			case '-':res=a-b;
					break;
			case '*':res=a*b;
					break;
			case '/':res=a/b;
					break;
			case '%':res=a%b;
					break;
		}
		System.out.println(res);
	}
}
