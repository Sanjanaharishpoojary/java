package external;
import java.io.File;
import java.util.*;
public class filehandling
{
	public  static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter file name");
		String fname=in.next();
		File f=new File(fname);
		System.out.println("file name:"+f.getName());
		f.setWritable(false);
		System.out.println(f.exists()?"file exists":"file does not exists");
		System.out.println(f.canRead()?"file is readable":"file is not readable");
		System.out.println(f.canWrite()?"file is writeable":"file is not writeaable");
		String fn=f.toString();
		int i=fn.lastIndexOf('.');
		if(i>0)
		{
			String type=fn.substring(i+1);
			System.out.println("file type:"+type);
		}
		else
			System.out.println("file doesnt have type");
		System.out.println("file length:"+f.length()+"bytes");
	}
}
