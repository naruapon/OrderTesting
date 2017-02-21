import java.util.Scanner;

public class Ordering {
	private String customerType;
	private int order;
	private float price;
	private float discount;
	private float discountPrice;
	private float totalPrice;
	private float netPrice;
	
	public void getOrder(){
		System.out.print("Please enter Custoemr Type :");
		Scanner in1 = new Scanner(System.in);
		customerType = in1.next();
		System.out.print("Please enter Order Number :");
		Scanner in2 = new Scanner(System.in);
		order = in2.nextInt();
		System.out.print("Please enter Unit Price :");
		Scanner in3 = new Scanner(System.in);
		price = in3.nextFloat();
		
		System.out.println("\t-- Order Data -- ");
		
		System.out.print("Customer Type :"+customerType);
		System.out.print("\tNumber of orders :"+order);
		System.out.println("\tUnit Price : "+price);
	}
	
	void processData(){
		if(customerType.equals("A")){
			if(order >=1 && order <=9){
				discount = 0;
				calculateTotalPrice();
				calculateDiscountPrice();
				calculateNetPrice();
			}else if(order >=10 && order <=99){
				discount = 5;
				calculateTotalPrice();
				calculateDiscountPrice();
				calculateNetPrice();
			}else if(order >=100 && order <=1000){
				discount = 10;
				calculateTotalPrice();
				calculateDiscountPrice();
				calculateNetPrice();
			}
		}
		if(customerType.equals("B")){
			if(order >=1 && order <=9){
				discount = 5;
				calculateTotalPrice();
				calculateDiscountPrice();
				calculateNetPrice();
			}else if(order >=10 && order <=99){
				discount = 15;
				calculateTotalPrice();
				calculateDiscountPrice();
				calculateNetPrice();
			}else if(order >=100 && order <=1000){
				discount = 25;
				calculateTotalPrice();
				calculateDiscountPrice();
				calculateNetPrice();
			}
		}
		if(customerType.equals("C")){
			if(order >=1 && order <=9){
				discount = 0;
				calculateTotalPrice();
				calculateDiscountPrice();
				calculateNetPrice();
			}else if(order >=10 && order <=99){
				discount = 20;
				calculateTotalPrice();
				calculateDiscountPrice();
				calculateNetPrice();
			}else if(order >=100 && order <=1000){
				discount = 25;
				calculateTotalPrice();
				calculateDiscountPrice();
				calculateNetPrice();
			}
		}
	}

	private void calculateTotalPrice(){
		totalPrice = price*order;
	}
	
	private void calculateNetPrice(){
		netPrice = totalPrice - discountPrice;
	}

	private void calculateDiscountPrice(){
		discountPrice = totalPrice*(discount/100);
	}	
	
	public float getDiscount(){
		return discount;
	}
	
	public float getDiscountPrice(){
		return discountPrice;
	}	
	
	public float getTotalPrice(){
		return totalPrice;
	}	
	
	public float getNetPrice(){
		return netPrice;
	}	

}
