package other.chainOfResponsibility.compareChar.handler;

public class HandlerC {
	public void handler(char c) {
		if(Character.isLetter(c)) {
			System.out.println("isletter");
		}
		if(Character.isDigit(c)) {
			System.out.println("isDigit");
		}
		if(Character.isUpperCase(c)) {
			System.out.println("isUpperCase");
		}
		if(Character.isLowerCase(c)) {
			System.out.println("isLowerCase");
		}
	}
}
