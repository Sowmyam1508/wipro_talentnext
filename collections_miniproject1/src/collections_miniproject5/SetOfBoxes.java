package collections_miniproject5;

import java.util.*;
import java.text.DecimalFormat;

class Box {
	private double length;
	private double width;
	private double height;

	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getVolume() {
		return length * width * height;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Box))
			return false;
		Box other = (Box) obj;
		return Math.round(this.getVolume() * 100.0) == Math.round(other.getVolume() * 100.0);
	}

	@Override
	public int hashCode() {
		return Objects.hash(Math.round(this.getVolume() * 100.0));
	}

	public void display() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(
				"Length =" + length + " Width =" + width + " Height =" + height + " Volume =" + df.format(getVolume()));
	}
}

public class SetOfBoxes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Box> boxSet = new LinkedHashSet<>();

		System.out.print("Enter the number of Box: ");
		int count = Integer.parseInt(scanner.nextLine());

		for (int i = 1; i <= count; i++) {
			System.out.println("Enter the Box " + i + " details");

			System.out.print("Enter Length: ");
			double length = Double.parseDouble(scanner.nextLine());

			System.out.print("Enter Width: ");
			double width = Double.parseDouble(scanner.nextLine());

			System.out.print("Enter Height: ");
			double height = Double.parseDouble(scanner.nextLine());

			Box box = new Box(length, width, height);
			if (!boxSet.contains(box)) {
				boxSet.add(box);
			}
		}

		System.out.println("Unique Boxes in the Set are");
		for (Box box : boxSet) {
			box.display();
		}

		scanner.close();
	}
}