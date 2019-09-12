package other.flyWeight.font.font;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public class FontFactory {
	
	private static Map<Font,WeakReference<Font>> fontMap = new WeakHashMap<Font,WeakReference<Font>>();
	public static Font create(String name,Style style,int size) {
		Font font = new Font();
		font.setName(name);
		font.setStyle(style);
		font.setSize(size);
		if(!fontMap.containsKey(font)) {
			fontMap.put(font,new WeakReference<Font>(font));
		}
		return fontMap.get(font).get();
	}
}