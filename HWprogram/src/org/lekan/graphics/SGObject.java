package org.lekan.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

/**
 * Represents a basic shape that can be drawn
 * 
 * @author Lekan Wang (lekan@lekanwang.com)
 * @author Martin Wickham (martinwickham@comcast.net)
 * @since 1.0
 */
public abstract class SGObject {
	protected int x, y;
	protected Color color;
	protected boolean isFilled;
	
	public SGObject(int x, int y, Color color, boolean isFilled) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.isFilled = isFilled;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	abstract void paint(Graphics g);

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void shift(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public static final List<SGObject> shift(int x, int y, List<SGObject> shapes) {
		for (SGObject obj : shapes) {
			obj.shift(x, y);
		}
		return shapes;
	}
}
