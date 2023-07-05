package Loops2;
import java.util.*;
public class Program4 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for(int i =0;i<str.length();i+=2)
		{
			System.out.println(str.charAt(i));
		}
		s.close();
	}
}
