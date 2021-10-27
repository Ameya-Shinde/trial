package first_hand_oct_26;

public class Factors {
	public static void main(String agrs[]) {
		
		int a=100;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.print(i+"\t");
			}
		}
	}

}
