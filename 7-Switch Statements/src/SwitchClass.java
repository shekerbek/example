
public class SwitchClass {

	public static void main(String[] args) {
		int Value=1;
		switch(Value){
		case 1:
			System.out.println("value was "+Value);
			break;
		case 2:
			System.out.println("value was 2");
			break;
		case 3:
			System.out.println("value was 3");
		case 4: case 5: case 6:
			System.out.println("value was 4,5 or 6");
			break;
		default:
			System.out.println("no value");
		
		}
				

	}

}
