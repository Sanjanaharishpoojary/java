package external;
import java.util.*;
public class arraylist 
{
	ArrayList<String> list= new ArrayList<String>();
	
	public void ardisp()
	{
		list.add("cse");
		list.add("ece");
		list.add("aiml");
		System.out.println(list);
	}
	
	public void app()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the element");
		String a=in.next();
		list.add(a);
		System.out.println(list);
	}
	
	public void pos()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the pos and element");
		int i=in.nextInt();
		String a=in.next();
		list.add(i,a);
		System.out.println(list);
	}
	
	public void search()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the element");
		String a=in.next();
		int i=list.indexOf(a);
		if(i==-1)
			System.out.println("element not found");
		else
			System.out.println("element found at position "+i);
	}
	
	public void chhar()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the first letter");
		char c=in.next().charAt(0);
		String a=Character.toString(c);
		System.out.println("the strings starting with"+a);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).startsWith(a))
				System.out.println(list.get(i));
		}
	}
	
	public static void main(String [] args)
	{
		arraylist s=new arraylist();
		s.ardisp();
		s.app();
		s.chhar();
		s.pos();
		s.search();
	}
}
