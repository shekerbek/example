import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter byte value");
		byte b1=scanner.nextByte();
		System.out.println("enter short");
		short s1=scanner.nextShort();
		System.out.println("enter integer value");
		int i1=scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter your name");
		String name=scanner.nextLine();
	
		System.out.println(b1+"|"+s1+"|"+i1+"|"+name);
		scanner.close();

	}

}
