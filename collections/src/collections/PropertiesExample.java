package collections;

import java.util.Properties;
import java.util.Set;
import java.util.Iterator;

public class PropertiesExample {
	public static void main(String[] args) {
		Properties stateCapital = new Properties();
		stateCapital.setProperty("Maharashtra", "Mumbai");
		stateCapital.setProperty("Karnataka", "Bengaluru");
		stateCapital.setProperty("Tamil Nadu", "Chennai");
		stateCapital.setProperty("West Bengal", "Kolkata");
		stateCapital.setProperty("Uttar Pradesh", "Lucknow");
		Set<Object> keys = stateCapital.keySet();
		System.out.println("States and their Capitals:");
		Iterator<Object> iterator = keys.iterator();
		while (iterator.hasNext()) {
			Object key = iterator.next();
			String capital = stateCapital.getProperty((String) key);
			System.out.println("State: " + key + " → Capital: " + capital);
		}
	}
}