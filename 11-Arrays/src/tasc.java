import java.util.Scanner;

public class tasc {

	public static void main(String[] args) {
		//create method getInteger
		
//		public static int[] getIntegers(int number){
//			Scanner scanner=new Scanner(System.in);
//			System.out.println("enter "+number+" integer values");
//			int[]values=new int(number);
		
		int sum=0;
		int counter=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your integer");
		for(int i=0; i<4; i++){
		int numbers=scanner.nextInt();
		sum=sum+numbers;
		counter++;
		
		}
		System.out.println("your sum is "+sum);

		
			
		}

	}


