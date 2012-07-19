package org.lekan.graphics;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * @author Lekan Wang (lekan@lekanwang.com)
 * @author Martin Wickham (martinwickham@comcast.net)
 * @since 2.0
 */
public class SGImage extends SGObject {
	
	// The image
	private BufferedImage img;
	private int width, height;
	
	/**
	 * creates a new image using the given image
	 * @param x
	 * @param y
	 * @param img
	 */
	public SGImage(int x, int y, BufferedImage img) {
		super(x,y,null,true);
		this.img = img;
		this.width = img.getWidth();
		this.height = img.getHeight();
	}
	
	/**
	 * creates a new image using the given image
	 * @param x
	 * @param y
	 * @param img
	 */
	public SGImage(int x, int y, SGImage img) {
		super(x,y,null,true);
		this.img = img.getImage();
		this.width = img.width;
		this.height = img.height;
	}
	
	/**
	 * creates an image from the given file
	 * This takes longer than most operations, so do not call this repeatedly.
	 * Instead, store it somewhere and use it to create your images with <code>new SGImage( x, y, saved)</code>.
	 * 
	 * @param x
	 * @param y
	 * @param filename
	 */
	public SGImage(int x, int y, String filename) {
		super(x,y,null,true);
		
		try {
			img = ImageIO.read(new File(filename));
			this.width = img.getWidth();
			this.height = img.getHeight();
		} catch (IOException e) {
			System.err.println("Unable to open the image \"" + filename + "\"");
			e.printStackTrace();
		}
	}
	
	/**
	 * creates an SGImage from the given BufferedImage and stretches it to the given width and height
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param image
	 */
	public SGImage(int x, int y, int width, int height,
			BufferedImage image) {
		this(x,y,image);
		this.width = width;
		this.height = height;
	}
	
	@Override
	void paint(Graphics g) {
		g.drawImage(img, x, y, width, height, null);
		
	}
	
	/**
	 * returns the image
	 * @return
	 */
	public BufferedImage getImage() {
		return img;
	}
	
	/**
	 * creates an array of subimages from one image
	 * 
	 * This is not incredibly efficient, so I don't recommend calling it often.
	 * 
	 * @param rowSize the number of subimages in a row
	 * @param colSize the number of subimages in a column
	 * @return
	 */
	public SGImage[][] split(final int rowSize, final int colSize) {
		SGImage[][] imgs = new SGImage[rowSize][colSize];
		for (int rowPos = 0; rowPos < rowSize; rowPos++) {
			for (int colPos = 0; colPos < colSize; colPos++) {
				imgs[rowPos][colPos] = getSubImg(x+(rowPos*img.getWidth())/rowSize, y+(colPos*img.getHeight())/colSize,
												 img.getWidth()/rowSize, img.getHeight()/colSize);
			}
		}
		return imgs;
	}
	
	/**
	 * creates a subimage from the original
	 * 
	 * this is not very efficient, as it copies each pixel individually.
	 * 
	 * @param xPos the x position of the top left corner of the image, relative to the origin (assumes the image is not stretched)
	 * @param yPos the y position of the top left corner of the image, relative to the origin (assumes the image is not stretched)
	 * @param width
	 * @param height
	 * @return
	 */
	public SGImage getSubImg(final int xPos, final int yPos, final int width, final int height) {
		assert (height <= img.getHeight() &&
				width <= img.getWidth() &&
				x+img.getWidth() >= xPos+width &&
				x+img.getHeight() >= yPos+height);
		BufferedImage b = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		for (int x = xPos-this.x, relX = 0; relX < width; x++, relX++) {
			for (int y = yPos-this.y, relY = 0; relY < height; y++, relY++) {
				b.setRGB(relX, relY, img.getRGB(x, y));
			}
		}
		return new SGImage(xPos, yPos, b);
	}
	
	/**
	 * stretches the image to the given dimensions, the top left corner does not move
	 * @param width
	 * @param height
	 */
	public void stretch(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	/**
	 * moves the image to a new location
	 * @param x
	 * @param y
	 * @return this
	 */
	public SGImage moveTo(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}
}
