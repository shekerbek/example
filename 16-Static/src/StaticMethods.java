
public class StaticMethods {

	public static void main(String[] args) {
		abc.show1();
		abc.show3();
		abc a1=new abc();
		a1.show2();
		a1.show4();
		System.out.println(Math.round(34.49));

	}
}
	
	class abc {
	
	public static void show1(){
		System.out.println("hello");
		show3();// in static method we can only call static methods
		
	}
	public void show2(){
		System.out.println("hi");//in instance method we can call static and instance method
		show3();
		show4();
		show1();
		
	}
	public static void show3(){
		System.out.println("helo");
	}
	public void show4(){
		System.out.println("heloo");
	}
	

}
