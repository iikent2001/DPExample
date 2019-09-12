package other.visitor.customerPayment.customer;

public class Customer implements Visitable{
	public void doCustomer() {
		System.out.println("do customer");
	}
	
	public void pay() {
		System.out.println("pay");
	}

	@Override
	public void accept(Visitor visitor) {
		
	}

}
