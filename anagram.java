package general;
import java.util.*;

public class anagram 
{

    public static boolean anagram(String s1, String s2) 
    {
        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");

        if (s1.length() != s2.length()) 
            return false;

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) 
    {
    	System.out.println("enter two strings");
    	Scanner in=new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        if (anagram(s1, s2)) 
            System.out.println(s1 + " and " + s2 + " are anagrams.");
         else 
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
    }
}



