package first_hand_oct_26;

public class Greatest_of_Three_Numbers {
	public static void main(String agrs[]) {
		int a= 100;
		int b= 200;
		int c= 150;
		
		if(a>b && a>c) {
			System.out.println(a);
		}else if(b>a && b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}

}
