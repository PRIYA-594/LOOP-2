package Loops2;
import java.util.*;
public class Program5 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j;
		for(i =1,j=n;i<=n;i++,j--)
		{
			System.out.println(i+" "+j);
		}
		s.close();
	}
}
