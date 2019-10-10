package assignment3;

public class q5_ShippingCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double shippingCharge;
		int userWeight=20;
		if(userWeight<=2) {
		shippingCharge=1.10;
		}else if(userWeight<=6) {
		shippingCharge=2.2;
		}else if(userWeight<=10) {
		shippingCharge=3.7;
		}else {
		shippingCharge=3.8;
		}
		System.out.println("For every 500 miles, your shipping charge will be "
		+ shippingCharge);

	}

}
