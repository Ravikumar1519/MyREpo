package practicecodes;
import java.util.*;
public class largestofthreenumbers {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First number");
		int a=sc.nextInt();
		
		Scanner nc =new Scanner(System.in);
		System.out.println("Enter second number");
		int b=sc.nextInt();
				
				
		Scanner rc =new Scanner(System.in);
		System.out.println("Enter third number");
		int c=sc.nextInt();
		
		
		if(a>b && a>c)
		{
			System.out.println(a+ " is larger");
		}
		else if(b>c && b>a)
		{
			System.out.println(b+ "is larger");
		}
		else
		{
			System.out.println(c+ "is larger");
		}
		
		
	
	
	
	}
}
