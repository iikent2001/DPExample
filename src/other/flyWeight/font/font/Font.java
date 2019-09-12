package other.flyWeight.font.font;

public class Font {
	private String name;
	private Style style;
	private int size;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Font) {
			if (obj == this) {
				return true;
			}
			Font font = (Font) obj;

			return font.getName() == this.getName() && font.getSize() == this.getSize()
					&& font.getStyle() == this.getStyle();
		}

		return false;

	}

	@Override
	public String toString() {
		return "Font name=" + name + ", style=" + style + ", size=" + size;
	}

}
