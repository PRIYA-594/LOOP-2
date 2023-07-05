package Loops2;
import java.util.*;
public class Program8 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		char i;
		do
		{
			i=s.next().charAt(0);
			System.out.println(i+" "+(int)i);
		}while(i=='1');
		s.close();
	}
}
