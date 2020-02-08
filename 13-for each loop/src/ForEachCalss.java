import java.util.Scanner;

public class ForEachCalss {

	public static void main(String[] args) {
		
		int counter=0;
		int numbers=0;
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your numbers ");
		while(numbers<=4){
		int numbers1=scanner.nextInt();
		numbers=numbers+numbers1;
		counter++;
		}
		
	    
		System.out.println("you entered "+numbers);
		
	}
}


