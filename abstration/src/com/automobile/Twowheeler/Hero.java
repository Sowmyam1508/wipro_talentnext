package com.automobile.Twowheeler;

import com.automobile.Vehicle;
public class Hero extends Vehicle{
	private int speed;
	private String modelName;
	private String registrationNumber;
	private String ownerName;

	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
	}
	
	public String getModelName() {
		return modelName;
	}
	@Override
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	@Override
	public String getOwnerName() {
		return ownerName;
	}
	public int getSpeed() {
		return speed;
	}
	public void radio() {
		System.out.println("Radio functionality is availbale in Hero.");	
	}

	
}