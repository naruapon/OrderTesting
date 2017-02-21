
public class TestCaseTesting {

	public static void main(String[] args) {
		Ordering o1 = new Ordering();
		o1.getOrder();
		o1.processData();	
		System.out.println("Total Price :"+o1.getTotalPrice());
		System.out.println("Discount :"+o1.getDiscount()+"%");
		System.out.println("Discount Price :"+o1.getDiscountPrice());
		System.out.println("Net Price :"+o1.getNetPrice());
	}

}
