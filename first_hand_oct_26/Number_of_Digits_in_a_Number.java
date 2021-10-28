package first_hand_oct_26;

import java.util.Scanner;

public class Number_of_Digits_in_a_Number {
	public static void main(String args[]) {
		
		int count = 0;
		Scanner f=new Scanner(System.in);
		int num=f.nextInt();
		f.close();
				

	    while (num != 0) {
	      
	      num /= 10;
	      count++;
	    }

	    System.out.println("Number of digits: " + count);
	}

}
