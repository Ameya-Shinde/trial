package first_hand_oct_26;

import java.util.Scanner;

public class Sum_of_Even_till_N {
	public static void main(String args[]) {
		
		int sum=0;
		System.out.println("Give the Ending number");
		Scanner e=new Scanner(System.in);
		int N=e.nextInt();
		
		e.close();
		
		for(int i=0;i<=N;i++) {
			
			if(i%2==0){
				sum=sum+i;
			}
		} 
		System.out.println("The sum of Even numbers till  "+ N +" is--");
		System.out.println(sum);
		
		
	}

}
