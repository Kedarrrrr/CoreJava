package practice;
import java.util.Scanner;

class newProduct{
	int id;
	String name;
	String discount;
	public newProduct(int id, String name) {
		this.id=id;
		this.name=name;
	}
}

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Product ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Product name: ");
		String name=sc.nextLine();
		sc.nextLine();
		newProduct mobile= new newProduct(id, name);
		mobile.discount="10%";
		
		System.out.println("Product name: "+ mobile.name );
		System.out.println("Product discount: "+ mobile.discount);

	}

}
