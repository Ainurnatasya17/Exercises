package Array1Dimensional;

public class Exercises1 {

	public static void main(String[] args) {
		//a) Declare an array of alpha of 15 element of type integer

		  int[] alpha = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		  int[] beta = new int[20];
		  
		//b) Output the value of the tenth element of the array alpha
		  System.out.println(alpha[9]);
		  
		//c) Set the value of the fifth element of the array alpha to 35
		  alpha[4] = 35;
		  System.out.println(alpha[4]);
		  
		//d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth of the array alpha
		  alpha[8] = alpha[5] + alpha[12];
		  System.out.println("Sum = " + alpha[8]);

	}

}
