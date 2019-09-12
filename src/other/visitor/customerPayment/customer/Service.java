package other.visitor.customerPayment.customer;

public class Service {
	private Visitor visitor = new VisitorImpl();
	
	public void  doService(Customer customer) {
		customer.doCustomer();
		customer.accept(visitor);
		customer.pay();
	}
	
	
	
}
