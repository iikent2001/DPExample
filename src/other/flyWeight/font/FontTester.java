package other.flyWeight.font;

import other.flyWeight.font.font.FontFactory;
import other.flyWeight.font.font.Style;

public class FontTester {

	public static void main(String...strings) {
		
		System.out.println(FontFactory.create("44", Style.BOLD, 3));
		System.out.println(FontFactory.create("44", Style.BOLD, 3));
	}
}
