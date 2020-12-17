package Array1Dimensional;

public class Exercises2 {

	public static void main(String[] args) {
		 //a) Write a statement that declare string array initialize with the following string: 
		//   sunday, monday, tuesday, wednesday, thursday, friday, saturday
	    //b) Write a loop that display content of each element in the array that you declared
			
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		//for loop
		for(int i = 0; i < days.length; i++) {
		    System.out.println(days[i]);
		
		} 
	    
		System.out.println();
		//while loop
		int j = 0;
		while (j < days.length) {
			System.out.println(days[j]);
			j++;
			
		}
		
		System.out.println();
		//do while loop
		int k = 0;
		do {
			System.out.println(days[k]);
			k++;
		}while (k < days.length);

	}

}
