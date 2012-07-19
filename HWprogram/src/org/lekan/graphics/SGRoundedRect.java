package org.lekan.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * A class representing a rounded rectangle.
 * 
 * @author Lekan Wang (lekan@lekanwang.com)
 * @author Martin Wickham (martinwickham@comcast.net)
 * @since 1.0
 */
public class SGRoundedRect extends SGRect {
	
	private int arcWidth, arcHeight;
	private final static double DEFAULT_ARC_SIZE_RATIO = 0.1;
	
	public SGRoundedRect(int x, int y, int width, int height, Color color, boolean isFilled) {
		this(x, y, width, height,
				(int)Math.ceil(DEFAULT_ARC_SIZE_RATIO * width),
				(int)Math.ceil(DEFAULT_ARC_SIZE_RATIO * height),
				color, isFilled);
	}
	
	public SGRoundedRect(int x, int y, int width, int height, int arcWidth, int arcHeight, Color color, boolean isFilled) {
		super(x, y, width, height, color, isFilled);
		
		this.arcWidth = arcWidth;
		this.arcHeight = arcHeight;
	}
	
	@Override
	void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(this.color);
		if (isFilled) g2.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
		else g2.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
	}
}
