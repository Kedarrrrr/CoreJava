package practice;

abstract class Employee{
	abstract double calculatesalary();
	
	void displayRole() {
		System.out.println("Employee Role");
	}
}

class FulltimeEmployee extends Employee{
	double monthlysalary=1000.0;
	double calculatesalary() {
		return monthlysalary;
	}
}
class PartTimeEmployee extends Employee{
	double hoursWorked=6.5;
	double hourlyRate=1000.0;
	double calculatesalary() {
		return hoursWorked*hourlyRate;
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Tom= new PartTimeEmployee();
		Tom.displayRole();
		System.out.println(Tom.calculatesalary());
		
		Employee Jerry= new FulltimeEmployee();
		Jerry.displayRole();
		System.out.println(Jerry.calculatesalary());
		

	}

}
