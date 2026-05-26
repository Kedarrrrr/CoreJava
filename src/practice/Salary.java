package practice;

public class Salary {

	private String name;
	private double salary;
	
	public Salary(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void CalculateSalary() {
		
	}
class FullTimeEmployee extends Salary{

	public FullTimeEmployee(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void CalculateSalary() {
		salary+=500;
		System.out.println("Full time Employee's Salary: "+salary);
	}
	
}
class PartTimeEmployee extends Salary{
	public PartTimeEmployee(String name, double salary) {
		super(name, salary);
	}
	@Override
	public void CalculateSalary() {
		salary-=200;
		System.out.println("Part time Employee's Salary: "+salary);
	}
}

public static void main(String[]args) {
	Salary e1=new Salary("Jack",200);
	Salary e2= new Salary("Jill", 100);
	e1.CalculateSalary();
	e2.CalculateSalary();
}
	

}
