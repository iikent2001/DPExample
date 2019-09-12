package other.bridge.turtle;

import other.bridge.turtle.drawing.JavaDrawing;
import other.bridge.turtle.turtle.Duke;
import other.bridge.turtle.turtle.Turtle;

public class TurtleTest {
	
	public static void main(String...strings) {
		Turtle duke = new Duke(new JavaDrawing());
		duke.move();
		duke.turn();
	}

}
