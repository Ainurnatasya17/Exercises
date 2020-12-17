package Array1Dimensional;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
	//write a program that create an array 10 element size. your program should prompt the users to input number in array and
	//display the sum of all array element	
    
	int[] numbers = new int[10];
	
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter numbers: ");
	
	for(int i = 0; i < numbers.length; i++) {
		numbers[i] = in.nextInt();
	}
	
	for(int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
	}
  
	int sum = 0;
	for(int i = 0; i < numbers.length; i++) {
		sum = sum + numbers[i];
	}
	
	System.out.println("The sum = " + sum);
	
  }
	
}