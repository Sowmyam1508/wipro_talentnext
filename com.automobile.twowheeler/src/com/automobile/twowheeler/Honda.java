
	package com.automobile.twowheeler;

	import com.automobile.Vehicle;

	public class Honda extends Vehicle {
	    @Override
	    public String getModelName() {
	        return "Honda City";
	    }

	    @Override
	    public String getRegistrationNumber() {
	        return "MH12XY4567";
	    }

	    @Override
	    public String getOwnerName() {
	        return "Anita Sharma";
	    }

	    public int getSpeed() {
	        return 120;  // Example speed
	    }

	    public void cdplayer() {
	        System.out.println("CD Player is ON in Honda. You can play music.");
	    }
	}

