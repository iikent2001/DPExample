package other.chainOfResponsibility.compareChar.handler;

public class LowercaseHandler extends CharHandler{

	public LowercaseHandler(CharHandler handler) {
		super(handler);
	}

	@Override
	public void compare(char c) {
		if(Character.isLowerCase(c)) {
			System.out.println("isLowerCase");
		}
		
	}

}
