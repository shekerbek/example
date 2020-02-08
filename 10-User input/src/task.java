import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
        int sum=0;
        int counter=1;
        while(counter<5){
        	System.out.println("enter your number-"+counter);
        	boolean bool=scanner.hasNext();
        	if(bool){
        		int number=scanner.nextInt();
        		sum=sum+number;
        		
        	}else{
        		System.out.println("invalid number");
        	}
        	counter++;
        	
        }
        System.out.println("your total is "+sum);
        scanner.close();
	
}
}
