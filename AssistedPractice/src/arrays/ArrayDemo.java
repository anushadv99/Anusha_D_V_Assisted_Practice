package arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60,70,80};
		for(int i=0;i<8;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9},
		            {4,2,8,1}};
		      
		      System.out.println("\nLength of row 1: " + b[0].length);
		      System.out.println("\nLength of row 2: " + b[1].length);
		      System.out.println("\nLength of row 1: " + b[2].length);
		 
	}

}
