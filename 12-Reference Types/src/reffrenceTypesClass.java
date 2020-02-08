import java.util.Arrays;

public class reffrenceTypesClass {

	public static void main(String[] args) {
		int myIntValue=10;
		int anotherValue=myIntValue;
		
		anotherValue=anotherValue+1;
		System.out.println("myIntValue is "+myIntValue);
		System.out.println("another value is "+anotherValue);
		
		System.out.println("-----------------------------------");
		
		int[] myIntArray=new int[5];
		int[] anotherArray=myIntArray;
		System.out.println("my int array is "+Arrays.toString(myIntArray));
		System.out.println("another array is "+Arrays.toString(anotherArray));

	}

}
