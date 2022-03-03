package practicecodes;

public class Swapping {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before Swapping numbers are" +a+" " +b);
		//temperory variable t
		/*int t=a;
		a=b;
		b=t;*/

		/*a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20*/
		
		/*a=a*b;//10*20=200
		b=a/b;//200/20=10
		a=a/b;//200/10=20*/
		
	/*	a=a^b;//10^20=30
		b=a^b;//30^20=10
		a=b^a;//10^30=20 bitwise operators*/
		
		b=a+b-(a=b);
				
		
		
		
		System.out.println("After Swapping numbers are" +a+" " +b);
	}

}
