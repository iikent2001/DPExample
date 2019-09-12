package other.chainOfResponsibility.compareChar.handler;

public class LetterHandler extends CharHandler{

	public LetterHandler(CharHandler handler) {
		super(handler);
	}

	@Override
	public void compare(char c) {
		if(Character.isLetter(c)) {
			System.out.println("isletter");
		}
		
	}

}
