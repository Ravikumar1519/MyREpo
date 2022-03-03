package practicecodes;
import java.util.Scanner;
public class No_ofDigits {
	public static void main(String[] args) {
	/*int num=14357857;
	int count= 0;
	while(num>0)
	{
		num=num/10;
		count++;
	}
	System.out.println("number of digits is:" +count);*/
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String str=sc.next();
		char ch;
		int count=0;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			ch = str.charAt(i);
			if(Character.isDigit(ch));
			{
				count++;
			}
			
			System.out.println(count);
		}
		
		
		
		
		
		
}
}
