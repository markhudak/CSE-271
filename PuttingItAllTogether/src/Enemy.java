import java.awt.Color;
import java.awt.Graphics;

public class Enemy extends GameObject implements ISelfMoving {

	private int speed;
	
	public Enemy(int x, int y, int width, int height, Color color, int screenWidth, int speed) {
		super(x, y, width, height, color, screenWidth);
		setSpeed(speed);
	}
	

	@Override
	public boolean move() {
		x += speed;
		if (x > screenWidth)
			x = -width;
		else if (x + width < 0)
			x = screenWidth;
		
		return false;
	}
	
	@Override
	public void draw(Graphics g) {

		g.setColor(color);
		g.fillRect(x, y, width, height);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
		
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

}
