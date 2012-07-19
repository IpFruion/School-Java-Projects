package org.lekan.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * A class representing a 2D rectangle.
 * 
 * @author Lekan Wang (lekan@lekanwang.com)
 * @author Martin Wickham (martinwickham@comcast.net)
 * @since 1.0
 */
public class SGRect extends SGObject {
	protected int width, height;
	
	/**
	 * Creates a rectangle at (x,y), with width and height. 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param color 
	 */
	public SGRect(int x, int y, int width, int height, Color color, boolean isFilled) {
		super(x,y,color,isFilled);
		this.width = width;
		this.height = height;
	}
	
	@Override
	void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(this.color);
		if (isFilled) g2.fillRect(x, y, width, height);
		else g2.drawRect(x, y, width, height);
	}
}
