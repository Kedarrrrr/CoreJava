package practice;
interface PaymentMethod{
	public double pay(double amount);

}
class UPI implements PaymentMethod{

	@Override
	public double pay(double amount) {
		// TODO Auto-generated method stub
		System.out.printf("Payment of $ %f done using UPI.",amount);
		System.out.println();
		return 0;
	}
	
}

class PayPal implements PaymentMethod{

	@Override
	public double pay(double amount) {
		System.out.printf("Payment of $ %f done using PayPal.",amount);
		System.out.println();


		// TODO Auto-generated method stub
		return 0;
	}
	
}

class CreditCard implements PaymentMethod{

	@Override
	public double pay(double amount) {
		System.out.printf("Payment of $ %f done using Credit Card.",amount);
		System.out.println();


		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class PaymentGateway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentMethod p1= new UPI();
		p1.pay(30.01);
		PaymentMethod p2 = new PayPal();
		p2.pay(50.40);
		PaymentMethod p3 = new CreditCard();
		p3.pay(40.23);

	}

}
