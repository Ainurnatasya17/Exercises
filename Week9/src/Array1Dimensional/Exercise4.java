package Array1Dimensional;
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
	 // The variable list1 and list2 are reference arrays that each have 5 elements
	 // Write code that copies the values in list1 and list2. Value in list1 are input by user
	    
		Scanner in = new Scanner(System.in);
		int[] list1 = new int[5];
		int[] list2 = new int[5];
		
		System.out.println("Enter 5 number: ");
		for (int i = 0; i < list1.length; i++) {
			list1[i] = in.nextInt();
		}
		
		System.out.println();
		System.out.println("List 1: ");
		for(int i = 0; i < list1.length; i++) {
			System.out.println(list1[i]);
		}
		
		System.out.println();
		System.out.println("List 2: ");
		for(int i = 0; i < list2.length; i++) {
			list2[i] = list1[i];
			System.out.println(list2[i]);
		}
	
	}

}
