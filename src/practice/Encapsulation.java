package practice;
import java.util.*;

class User{
	private String username;
	private String password;
	public User(String name, String pass) {
		if(pass.length()<3) {
			throw new IllegalArgumentException("Weak password");
		}
		this.password=pass;
		this.username=name;
	}
	
	public String Userget(){
		return username;
	}
	public void Userset(String name, String pass) {
		if(pass.length()<3) {
			throw new IllegalArgumentException("Weak password");
		}
		
		this.username=name;
		this.password=pass;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String name= sc.nextLine();
		
		System.out.println("Enter the password: ");
		String pass= sc.nextLine();
		
		User user= new User(name, pass);
		System.out.println("Name: "+ user.Userget());
		

	}

}
