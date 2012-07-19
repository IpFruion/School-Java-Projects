package org.lekan.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 * Represents a 2D ellipse.
 * 
 * @author Lekan Wang (lekan@lekanwang.com)
 * @author Martin Wickham (martinwickham@comcast.net)
 * @since 1.0
 */
public class SGEllipse extends SGObject {
	private int xRadius, yRadius;
	private Stroke stroke;
	
	/**
	 * Creates an ellipse with center (x,y), and given x and y radii.
	 * 
	 * @param x the x coordinate of the center of the ellipse
	 * @param y the x coordinate of the center of the ellipse
	 * @param xRadius the radius on the x dimension
	 * @param yRadius the radius on the y dimension
	 */
	public SGEllipse(int x, int y, int xRadius, int yRadius, Color color, boolean isFilled) {
		super(x,y,color,isFilled);
		this.xRadius = xRadius;
		this.yRadius = yRadius;
		this.stroke = SGGraphicsContext.stroke;
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(color);
		g2.setStroke(stroke);
		
		if (isFilled) g2.fillOval(x-xRadius, y-yRadius, 2*xRadius, 2*yRadius);
		else 		  g2.drawOval(x-xRadius, y-yRadius, 2*xRadius, 2*yRadius);
	}
}
