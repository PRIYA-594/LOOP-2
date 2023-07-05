package Loops2;
import java.util.*;
public class Program10 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int sum=0,num;
		do
		{
			num = s.nextInt();
			if(num%2==1)
			{
				sum+=num;
			}
		}while(num==-1);
		System.out.println(sum);
		s.close();
	}
}
