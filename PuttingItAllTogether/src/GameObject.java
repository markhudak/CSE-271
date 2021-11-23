import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject extends Rectangle {

	public Color color;
	public int screenWidth;
	
	public GameObject(int x, int y, int width, int height, Color color, int screenWidth) {
		super(x, y, width, height);
		this.color = color;
		this.screenWidth = screenWidth;
	}
	
	public abstract void draw(Graphics g);
	
	
}
