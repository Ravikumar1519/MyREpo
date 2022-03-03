package practicecodes;
public class ReverseString {
	public static void main(String[] args) {
		String str = "MADAM";
		String rev = "";
		 String org_str=str;
		/*int len = str.length();
		for(int i =len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}*/
		
		
		
		/*char a[]=str.toCharArray();//a=[A,B,C,D] stores values in array a[]
		int len =a.length;
		for(int i=len-1;i>=0;i--)
		{
			rev = rev + a[i];
		}
		
		System.out.println("Reverse String is:" +rev);*/
		
		StringBuffer sb =new StringBuffer(str);//using StringBiffer
		sb.reverse();
		
		if(org_str.contentEquals(sb) )
		{
			System.out.println(org_str+ " is a palindrome String");
		}
		else
		{
			System.out.println(org_str+ " is not a palindrome String");
		}
		
		
	}
	
	

}
