package abstration;import java.util.Random;
abstract class Compartment {
	public abstract String notice();
}
class Firstclass extends Compartment{
	@Override
	public String notice(){
	return "First Class compartment";
	}
}
class Ladies extends Compartment{
	@Override
	public String notice(){
	return "Ladies Compartment";
	}
}
class General extends Compartment{
	@Override 
	public String notice(){
	return "General Compartment";
	}
}
class Luggage extends Compartment{
	@Override
	public String notice() {
		return "Luggage";
	}
}

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Compartment[] compartments = new Compartment[10];
	        Random rand = new Random();

	        for (int i = 0; i < 10; i++) {
	            int type = rand.nextInt(4) + 1; // Random number between 1 and 4

	            switch (type) {
	                case 1:
	                    compartments[i] = new Firstclass();
	                    break;
	                case 2:
	                    compartments[i] = new Ladies();
	                    break;
	                case 3:
	                    compartments[i] = new General();
	                    break;
	                case 4:
	                    compartments[i] = new Luggage();
	                    break;
	            }
	        }
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
	        }

	}

}


