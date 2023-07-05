package Loops2;
import java.util.*;
public class Program9 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int len = str.length();
		int i,j;
		for(i=0,j=len-1;i<len;i++,j--)
		{
			System.out.println(str.charAt(i)+" "+str.charAt(j));
		}
		s.close();
	}
}
