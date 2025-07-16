package oops;


public class Fruit {
	protected String name;
	protected String taste;
	protected String size;
	
	public Fruit(String name, String taste, String size) {
		this.name = name;
		this.taste =taste;
		this.size = size;	
	}
	public void eat() {
		System.out.println("The "+name+ " is"+taste+".");
	}
}
class Apple extends Fruit{
	public Apple(String size) {
		super("Apple", "sweet", size);
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("The apple is sweet");
	}
}
class Orange extends Fruit{
	public Orange(String size) {
		super("Orange","sour",size);
	}
	public void eat() {
		System.out.println("The orange is sour");
	}
}
class myFruit{
	public static void main(String[] args) {
		Apple ap = new Apple("medium");
		Orange or = new Orange("Large");
		
		ap.eat();
		or.eat();
	}
	
}
