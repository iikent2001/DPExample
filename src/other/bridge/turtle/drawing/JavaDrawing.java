package other.bridge.turtle.drawing;

public class JavaDrawing implements Drawing{

	@Override
	public void drawImage(String image) {
		 System.out.println("Java 2D 畫 " + image);
	}

	@Override
	public void drawLine() {
		System.out.println("Java 2D 畫線 ");
	}

	@Override
	public void turnImage(String image) {
		System.out.println("Java 2D 轉 " + image);
	}

	@Override
	public void rotateImage(String image) {
		System.out.println("Java 2D 翻 " + image);
	}
}
