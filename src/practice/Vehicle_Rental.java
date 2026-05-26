package practice;

class Vehicle{
	private int vehicleNumber;
	private double rentPerDay;
	private String brand;
	
	public Vehicle(int vehicleNumber, double rentPerDay, String brand) {
		this.vehicleNumber=vehicleNumber;
		this.rentPerDay=rentPerDay;
		this.brand=brand;
	}
	
	public double calculateRent(int days) {
		return days*rentPerDay;
		
	}
	
	public void displayDetails() {
		System.out.println("Number: "+vehicleNumber);
		System.out.println("rentPerDay: "+rentPerDay);
		System.out.println("Brand: "+brand);
	}
	
}

class Car extends Vehicle{
	public Car(int vehicleNumber, double rentPerDay, String brand) {
		super(vehicleNumber, rentPerDay, brand);
		// TODO Auto-generated constructor stub
	}

	private int numberOfSeats;
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Number of Seats: "+numberOfSeats);
	}
	
}

class Bike extends Vehicle{
	private boolean hasHelmet;
	public Bike(int vehicleNumber, double rentPerDay, String brand, boolean hasHelmet) {
		super(vehicleNumber, rentPerDay, brand);
		this.hasHelmet=hasHelmet;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Helmet: "+hasHelmet);
	}
}



public class Vehicle_Rental {
	public static void main(String[]args) {
		Vehicle re= new Bike(202, 40.0,"Royal Enfield", true);
		re.calculateRent(5);
		re.displayDetails();
	}
}
