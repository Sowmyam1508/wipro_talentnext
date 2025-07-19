package oops;
import java.util.*;
public class Box {
	private double width;
	private double height;
	private double depth;
	public   Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public double getvolume() {
		return width*height*depth;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		double depth = sc.nextDouble();
		Box b = new Box(width,height,depth);
		System.out.println(b.getvolume());
	}

}

