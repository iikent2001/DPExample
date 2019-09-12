package other.chainOfResponsibility.compareChar;

import other.chainOfResponsibility.compareChar.handler.CharHandler;
import other.chainOfResponsibility.compareChar.handler.DigitHandler;
import other.chainOfResponsibility.compareChar.handler.HandlerC;
import other.chainOfResponsibility.compareChar.handler.LetterHandler;
import other.chainOfResponsibility.compareChar.handler.LowercaseHandler;
import other.chainOfResponsibility.compareChar.handler.UppercaseHandler;

public class CharacterTester {
	public static void main(String...strings) {
		long startTime = System.nanoTime();
		CharHandler hanlder = new LetterHandler(new DigitHandler(new UppercaseHandler(new LowercaseHandler(null)))) ;
		hanlder.handle('c');
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		
//		long startTime = System.nanoTime();
//		new HandlerC().handler('c');
//		long endTime = System.nanoTime();
//		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}
}
