import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Ship extends GameObject {

	public Ship(int x, int y, int width, int height, Color color, int screenWidth) {
		super(x-width/2, y, width, height, color, screenWidth);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x + width/3, y, width/3, height/2);
		g.fillRect(x, y + height/2, width, height/2);
		
		g.setColor(color.BLACK);
		g.drawRect(x + width/3, y, width/3, height/2);
		g.drawRect(x, y + height/2, width, height/2);

	}
	
	@Override
	public void setLocation(Point p) {
		x = p.x - width/2;
	}

}
