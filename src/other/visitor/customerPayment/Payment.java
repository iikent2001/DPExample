package other.visitor.customerPayment;

import other.visitor.customerPayment.customer.Customer;
import other.visitor.customerPayment.customer.Member;
import other.visitor.customerPayment.customer.Service;
import other.visitor.customerPayment.customer.Vip;

public class Payment {

	public static void main(String...strings) {
		Service service = new Service();
		service.doService(new Member());
		service.doService(new Customer());
		service.doService(new Vip());
	}
}
