
public class Car extends Vehicle{
	
	//public String vehicleColor, vehicleType;
	
	public Car(){
		//System.out.println("What kind of car do you have\n");
	}			
	public String  Passed(String vehicle2){
		String sentence = this.getVehicleColor()+" "+this.getVehicleType()+ " has passed "+ " "+ vehicle2; 
		return sentence;
	}
	
	
}
