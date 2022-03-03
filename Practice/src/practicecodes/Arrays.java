package practicecodes;

public class Arrays {
	public static void main(String[] args) {
		/*int a[]= {1,2,3,4};
		int b[]= {2,4,6,8};
		int c[]= {5,6,7,8};*/
		
		
		int d[][]= {//2Dimensional Array
				
				{1,2,3,4},
				{2,4,6},  //jagged Arrays size is not fixed
				{5,6,7,8,9}
		
		};
		
	for(int i=0;i<3 ;i++)
	{
		for(int j=0;j<d[i].length;j++)
		{
		   System.out.print(" "+d[i][j]);
		}
		System.out.println();
	}
}
}