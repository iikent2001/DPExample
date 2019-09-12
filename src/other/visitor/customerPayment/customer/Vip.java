package other.visitor.customerPayment.customer;

public class Vip extends Customer{
	
	public void doVip() {
		System.out.println("vip server");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
