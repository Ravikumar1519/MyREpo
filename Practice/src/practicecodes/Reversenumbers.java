package practicecodes;
import java.util.Scanner;
import java.util.Scanner;
public class Reversenumbers {
	static int rev=0;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	while(num!=0)
	{
		rev=rev*10+num%10;
		 num = num/10;
	}
	System.out.println(rev);
	
	
}
	

}
