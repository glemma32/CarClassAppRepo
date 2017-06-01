import java.util.Scanner;

public class Vehicle {
	
	private int speed;
	private String vehicleType;
	private String vehicleColor;
	
	/*public String WhatKind(){
		Scanner Input = new Scanner(System.in);
		carType = Input.next();
	    return carType;
	}*/
	public String start(){
		return "The "+vehicleColor +" "+vehicleType+ " is starting";
	}
	public String accelerate(){
		return "The "+vehicleColor+ " "+ vehicleType+" is accelerating";
	}
	/*public String setSpeed(){
		System.out.println("What is the speed of the car");
		Scanner UserInput = new Scanner(System.in);
		speed = UserInput.nextInt();
		return "The "+carType+" is going" + speed;
				
	}*/
	public String Speeds(){
		return "The " +vehicleColor+" "+vehicleType+" is " + "going "+speed+" mph";
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleColor() {
		return vehicleColor;
	}
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String Stop(){
		return "The " +vehicleColor+" "+vehicleType+" is stopped";
	}
	public String Stops() {
		return "The " + vehicleColor+" "+ vehicleType+ " has stopped to have its emissions checked";
	}
	public String Pass() {
		return "The " + vehicleColor+" "+ vehicleType+ " passes its emission test";
	}
	/*public String Passed() {
		return "The " + vehicleColor+" "+ vehicleType+ " just passed the "+ vehicleColor+" "+ vehicleType;
	}*/
}
