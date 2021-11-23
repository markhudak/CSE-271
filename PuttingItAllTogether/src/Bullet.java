import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends GameObject implements ISelfMoving{

	private int speed;
	
	public Bullet(int x, int y, int width, int height, Color color, int screenWidth, int speed) {
		super(x, y, width, height, color, screenWidth);
		setSpeed(speed);
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(color);
		g.fillRect(x, y, width, height);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
		
	}

	@Override
	public boolean move() {
		y += speed;
		return (y + height) <= 0;
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = -Math.abs(speed);
	}

	@Override
	public int getSpeed() {
		return speed;
	}

}
