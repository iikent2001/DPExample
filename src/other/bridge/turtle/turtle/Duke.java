package other.bridge.turtle.turtle;

import other.bridge.turtle.drawing.Drawing;

public class Duke implements Turtle{
	
	private String name= "duke";
	private Drawing drawing ;
	
	public Duke(Drawing drawing) {
		this.drawing = drawing;
	}

	@Override
	public void move() {
		System.out.println("move=image+line");
		drawing.drawImage(name);
		drawing.drawLine();
	}

	@Override
	public void turn() {
		System.out.println("turn=rotateImage+turnImage");
		drawing.rotateImage(name);
		drawing.turnImage(name);
	}

}
