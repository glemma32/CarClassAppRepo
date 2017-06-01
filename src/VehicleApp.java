
public class VehicleApp {
	public static void main(String[] args){
	
		
		
		//print(c.WhatKind());
		
		
		/*Car redCar = new Car();
		redCar.setVehicleColor("red");
		redCar.setVehicleType("Porche");
		print(redCar.start());
		print(redCar.accelerate());
		redCar.setSpeed(50);
		print(redCar.Speeds());
		print(redCar.Stop());
		
		Car blueCar = new Car();
		blueCar.setVehicleColor("blue");
		blueCar.setVehicleType("Jetta");
		print(blueCar.start());
		print(blueCar.accelerate());
		blueCar.setSpeed(50);
		print(blueCar.Speeds());
		print(blueCar.Stop());*/
		
		Car c = new Car();
		Car b = new Car();
		c.setVehicleColor("red");
		c.setVehicleType("Porche");
		b.setVehicleColor("blue");
		b.setVehicleType("Jetta");
		print(c.start());
		print(b.start());
		print(c.accelerate());
		print(b.accelerate());
		print(b.Stops());
		print(b.Pass());
		c.setSpeed(50);
		print(c.Speeds());
		print(c.Stop());
		print(c.Passed(b.getVehicleColor()+b.getVehicleType()));
		
				
		}
		
	private static void print(String s){
		System.out.println(s);
	}
	

}
