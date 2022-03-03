package practicecodes;
import java.util.*;
public class Even {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value of n");
				int n=sc.nextInt();
				int count=0;
				
				for( int i=1;i<=n;i++)
				{
					if(i%2==0)
					{
						count=count;
					}
					else
					{
						count++;
					}
				}
				System.out.println(+count);
	}
}