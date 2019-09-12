package other.chainOfResponsibility.compareChar.handler;

public class UppercaseHandler extends CharHandler{

	public UppercaseHandler(CharHandler handler) {
		super(handler);
	}

	@Override
	public void compare(char c) {
		if(Character.isUpperCase(c)) {
			System.out.println("isUpperCase");
		}
	}
}
