package asciiPanel;

import org.springframework.beans.factory.annotation.Autowired;

public class AsciiFont {

	private String fontFilename;

	public String getFontFilename() {
		return fontFilename;
	}

	private int width;

	public int getWidth() {
		return width;
	}

	@Autowired
	public void setFontFilename(String fontFilename) {
		this.fontFilename = fontFilename;
	}

	@Autowired
	public void setWidth(int width) {
		this.width = width;
	}

	@Autowired
	public void setHeight(int height) {
		this.height = height;
	}

	private int height;

	public int getHeight() {
		return height;
	}
}
