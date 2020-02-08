
public class LogicalOperators {

	public static void main(String[] args) {
		char a1='A';
		char a2=65;
		
		int b1=12;
		int b2=20;
		
		boolean result1=(b1==b2)&&(a1==a2);
		System.out.println(result1);
		
		boolean result2=(b1==b2)&(a1==a2);
		System.out.println(result2);
		
		boolean res3=(b1==b2)||(a1==a2);
		System.out.println(res3);
		
		boolean res4=(b1==b2)|(a1==a2);
		System.out.println(res4);
		
		boolean res5=(b1==b2)^(a1==a2);
		System.out.println(res5);
		
		
	}

}
