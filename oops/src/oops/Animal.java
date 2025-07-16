package oops;
public class Animal {
	 void eat() {
		System.out.println("eat food");
	}
	 void sleep() {
		System.out.println("early sleep");
		}
}
class Bird extends Animal{
	@Override
	 void eat() {
		System.out.println("bird is eating");
}
	@Override
	 void sleep() {
		System.out.println("bird is sleeping");
	}
	 void fly() {
		System.out.println("bird is flying");
	}
}
class Myclass{
	public static void main(String[] args) {
			Animal animal = new Animal();
			animal.eat();
			animal.sleep();
			Bird bird = new Bird();
			bird.eat();
			bird.sleep();
			bird.fly();	
}
}
