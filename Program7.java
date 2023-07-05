package Loops2;
import java.util.*;
public class Program7 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num,sum=0;
		do
		{
			num=s.nextInt();
			sum+=num;
		}while(num==-1);
		System.out.println(sum);
		s.close();
	}
}
