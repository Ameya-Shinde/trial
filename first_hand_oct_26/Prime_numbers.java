package first_hand_oct_26;

public class Prime_numbers {
	
		public static void main(String agrs[]) {
			
			int a=11;
			int count=0;
			
			
			for(int i=1;i<=a;i++){
				if(a%i==0){
					count=count+1;
				}
			}
			
			if(count==2) {
				System.out.println("prime");
			}else {
				System.out.println("not prime");
			}
		}

	}
		
