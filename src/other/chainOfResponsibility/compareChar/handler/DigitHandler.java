package other.chainOfResponsibility.compareChar.handler;

public class DigitHandler extends CharHandler{
	
	public DigitHandler(CharHandler handler) {
		super(handler);
	}

	@Override
	public void compare(char c) {
		if(Character.isDigit(c)) {
			System.out.println("isDigit");
		}
		
	}

}
