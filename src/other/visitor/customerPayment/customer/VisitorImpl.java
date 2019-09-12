package other.visitor.customerPayment.customer;

public class VisitorImpl implements Visitor{

	@Override
	public void visit(Vip vip) {
		vip.doVip();
	}

	@Override
	public void visit(Member member) {
		member.doMember();
	}

}
