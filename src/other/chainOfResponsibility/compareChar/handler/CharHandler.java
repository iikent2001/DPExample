package other.chainOfResponsibility.compareChar.handler;

public abstract class CharHandler {
	private CharHandler handler;
	
	public CharHandler(CharHandler handler) {
		this.handler = handler;
	}
	
	public final void handle(char c) {
		compare(c);
		next(c);
	}
	
	public final void next(char c) {
		if(this.handler != null) {
			handler.handle(c);
		}
	}
	
	public abstract void compare(char c);
	
}
