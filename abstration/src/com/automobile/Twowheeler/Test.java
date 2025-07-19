package com.automobile.Twowheeler;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hero hero = new Hero("Hero Deluxe", "KA-01-AB-1234", "John Doe", 60);
	     Honda honda = new Honda("Honda Activa", "KA-02-CD-5678", "Jane Smith", 50);
	     System.out.println("Hero Details:");
	        System.out.println("Model: " + hero.getModelName());
	        System.out.println("Registration: " + hero.getRegistrationNumber());
	        System.out.println("Owner: " + hero.getOwnerName());
	        System.out.println("Speed: " + hero.getSpeed());
	        hero.radio();
	        System.out.println();
	        System.out.println("Honda Details:");
	        System.out.println("Model: " + honda.getModelName());
	        System.out.println("Registration: " + honda.getRegistrationNumber());
	        System.out.println("Owner: " + honda.getOwnerName());
	        System.out.println("Speed: " + honda.getSpeed());
	        honda.cdplayer();
	}
}