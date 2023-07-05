package Loops2;
import java.util.*;
public class Program3 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=1;i<=20;i++)
		{
			System.out.println(num+" *"+i+"="+num*i);
		}
		s.close();
	}
}
