package com.automobile.Twowheeler;
import com.automobile.Vehicle;

public class Honda extends Vehicle {

    private int speed;
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
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

    public void cdplayer() {
        System.out.println("Controlling Honda CD player...");
    }
}