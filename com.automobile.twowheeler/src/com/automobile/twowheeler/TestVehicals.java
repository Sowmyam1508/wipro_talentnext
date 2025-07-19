package com.automobile.twowheeler;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestVehicals {
	
	    public static void main(String[] args) {
	        System.out.println("===== Hero Bike Details =====");
	        Hero hero = new Hero();
	        System.out.println("Model Name: " + hero.getModelName());
	        System.out.println("Registration Number: " + hero.getRegistrationNumber());
	        System.out.println("Owner Name: " + hero.getOwnerName());
	        System.out.println("Speed: " + hero.getSpeed() + " km/h");
	        hero.radio();

	        System.out.println("\n===== Honda Car Details =====");
	        Honda honda = new Honda();
	        System.out.println("Model Name: " + honda.getModelName());
	        System.out.println("Registration Number: " + honda.getRegistrationNumber());
	        System.out.println("Owner Name: " + honda.getOwnerName());
	        System.out.println("Speed: " + honda.getSpeed() + " km/h");
	        honda.cdplayer();
	    }
	}



