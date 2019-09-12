package other.visitor.customerPayment.customer;

public interface Visitor {
	public void visit(Vip vip);
	public void visit(Member member);
}
