package practicecodes;
import java.util.Scanner;
public class Palindrome {
	
	//public static void main(String ags)
	//{
	//*	Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter a number");
		//int num=sc.nextInt();
	   // int org_num = num;
	//	int rev = 0;
	//	while(num!=0)
	//	{
	//		rev =rev*10+num%10;
	//		num=num/10;
	//	}
	//	if(org_num == rev)
	//	{
	//		System.out.println(org_num+ "is Palindrome number");
	//	}
	//	else
	//	{
	//		System.out.println(org_num+ "is not Palindrome number");
	//	}
//	}
	

//}
		public static void main(String args[]){  
			  int r,sum=0,temp;    
			  int n=454;//It is the number variable to be checked for palindrome  
			  
			  temp=n;    
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			}  