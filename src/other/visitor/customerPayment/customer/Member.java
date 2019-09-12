package other.visitor.customerPayment.customer;

public class Member extends Customer{

	public void doMember() {
		System.out.println("member server");
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
