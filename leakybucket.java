package cn;
import java.util.*;
public class leaky 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int bucketsize,output,drop=0,ch,cont=0,x,i=0;
		int input[]=new int[35];
		System.out.println("enter bucketsize and output rate");
		bucketsize=in.nextInt();
		output=in.nextInt();
		
		do
			
		{
			System.out.println("enter input rate "+(i+1));
			input[i++]=in.nextInt();
			System.out.println("enter 1 to insert packet or 0 to quit");
			ch=in.nextInt();
		}while(ch==1);
		
		int nsec=i;
		
		System.out.println("seconds\tinput\toutput\tin bucket\tdropped");
		for(cont=i=0;(cont>0)||(i<nsec);i++)
		{
			System.out.print(i+1);
			System.out.print(input[i]);
			int res=Math.min(output,cont+input[i]);
			System.out.print(res);
			
			if((x=cont+input[i]-output)>0)
			{
				if(x>bucketsize)
				{
					cont=bucketsize;
					drop=x-bucketsize;
				}
				else
				{
					cont=x;
					drop=0;
				}
			}
			else
				cont=0;
			System.out.print(cont);
			System.out.print(drop);
			System.out.println();
			
		}
		
		
	}
}
