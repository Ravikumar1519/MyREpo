package practicecodes;
import java.util.*;
public class One {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year");
	int year=sc.nextInt(); {
	if((year%4==0) && (year%100==0) && (year%400==0))
	{
		System.out.println("Entered year is leap year");
		
	}
	else
	{
		System.out.println("Entererd year is not a leap year");
	}
	
	
	

}
}
}
