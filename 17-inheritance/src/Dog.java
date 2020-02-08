
public class Dog extends Animal{
	private int eyes;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int brain, int body, int size, int weight, int eyes, int tail, int teeth, String coat) {
		super(name, brain, body, size, weight);
		this.eyes = eyes;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	public void chew(){
		System.out.println("Dog.chew() is called");
	}
	public void walk(){
		System.out.println("Dog.walk() is called");
	}
	@Override
	public void eat(){
		System.out.println("Dog.eat() is called");
		super.eat();
		chew();
	}
	public void run(){
		System.out.println("Dog.run() is called");
		super.move(40);
	}
	
	


}
