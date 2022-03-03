package practicecodes;
import java.util.*;
public class Tables {
	
	int i;
	static int j;
	public static void main(String[] args) {
		
		for(int i=1;i<=20;i++)
		{
			for(j=1;j<=10;j++)
			{
				System.out.printf("%d * %d = %d\n",i ,j,(i * j));
			
			}
			System.out.println();
		}
	}
   

}
