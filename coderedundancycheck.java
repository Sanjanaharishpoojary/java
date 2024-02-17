package cn;
import java.util.*;
public class coderedundancycheck
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int totlen,i,divisorbits,databits;
		System.out.println("enter no. of divisor bits");
		divisorbits=in.nextInt();
		int divisor[]=new int[divisorbits];
		System.out.println("enter the divisor bits");
		for(i=0;i<divisorbits;i++)
			divisor[i]=in.nextInt();
		System.out.println("enter no. of data bits");
		databits=in.nextInt();
		int data[]=new int[databits+1];
		System.out.println("enter the data bits");
		for(i=0;i<databits;i++)
			data[i]=in.nextInt();
		
		totlen=databits+(divisorbits-1);
		int rem[]=new int[totlen];
		int crc[]=new int[totlen];
		int dividend[]=new int[totlen];
		for(i=0;i<data.length;i++)
		{
			dividend[i]=rem[i]=data[i];
			
		}
		rem=divide(dividend,rem,divisor);
		for(i=0;i<rem.length;i++)
			crc[i]=rem[i]^dividend[i];
		System.out.println("the crc bits are");
		for(i=0;i<dividend.length;i++)
			System.out.print(crc[i]);
		System.out.println();
		
		System.out.println("enter receiver code");
		for(i=0;i<crc.length;i++)
			crc[i]=rem[i]=in.nextInt();
		rem=divide(crc,rem,divisor);
		for(i=0;i<rem.length;i++)
		{
			if(rem[i]!=0)
			{
				System.out.println("error");
				break;
			}
			if(i==rem.length-1)
				System.out.println("no error");
			
		}
		
		
	}
	public static int[] divide(int dividend[],int rem[],int divisor[])
	{
		int cur=0;
		while(true)
		{
			for(int i=0;i<divisor.length;i++)
				rem[cur+i]=(rem[cur+i]^divisor[i]);
			while(rem[cur]==0 && cur!=rem.length-1)
				cur++;
			if((rem.length-cur)<divisor.length)
				break;
		}
		return rem;
			
	}
}
