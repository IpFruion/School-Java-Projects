package org.lekan.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * 
 * 
 * @author Lekan Wang (lekan@lekanwang.com)
 * @author Martin Wickham (martinwickham@comcast.net)
 * @since 1.0
 */
public class SGText extends SGObject {
	public static final Font DEFAULT_FONT = new Font("Dialog", Font.PLAIN, 14); 
	private Font font;
	private String[] text;
	
	/**
	 * Constructs an SGText object with the given text, at the given coordinate.
	 * @param text
	 * @param x
	 * @param y
	 */	
	public SGText(String text, int x, int y, Color color) {
		this(text, x, y, DEFAULT_FONT, color);
	}
	
	/**
	 * Constructs an SGText object with the given text, at the given coordinate,
	 * with the given font.
	 * @param text
	 * @param x
	 * @param y
	 * @param font
	 */
	public SGText(String text, int x, int y, Font font, Color color) {
		super(x,y,color,true);
		this.font = font;
		this.text = text.split("\n");
	}
	
	public SGText(String text, int x, int y, int size, Color color) {
		this(text, x, y, new Font("Dialog", Font.PLAIN, size), color);
	}

	@Override
	void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(color);
		g2.setFont(font);
		
		for (int c = 0; c < text.length; c++) {
			g2.drawString(text[c], x, y+(c*font.getSize()));
		}
	}
	
	/**
	 * Sets the text of this SGText object.
	 * @param text
	 */
	public void setText(String text) {
		this.text = text.split("\n");
	}
	
	/**
	 * Sets the font of this SGText object.
	 * @param font
	 */
	public void setFont(Font font) {
		this.font = font;
	}

	/**
	 * Package getter for the font
	 */
	Font getFont() {
		return this.font;
	}
	
	/**
	 * returns the text array, split at newline characters.
	 * @return
	 */
	public String[] getText() {
		return this.text;
	}
}
