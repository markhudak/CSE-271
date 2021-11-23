import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Tester extends JPanel{

	public static void main(String[] args) {
		new Tester();
	}

	//==========================================================================
	
	
	JFrame window = new JFrame("My First 271 Game...");

	Timer tmr = null;
	
	Ship ship = null;
	
	ArrayList<Bullet> bullets = new ArrayList<Bullet>();
	ArrayList<Enemy> enemies = new ArrayList<Enemy>();

	public Tester() {

		window.setBounds(100, 100, 600, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setAlwaysOnTop(true);
		window.getContentPane().add(this);
		

		tmr = new Timer(25, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int i = bullets.size()-1; i >= 0; i--)
					if(bullets.get(i).move());
				
				for (int i = enemies.size()-1; i >= 0; i--) {
					enemies.get(i).move();
				}
				
				repaint();

			}
		});

	
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				ship.setLocation(e.getPoint());
				repaint();
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				mouseMoved(e);
			}
		});

		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(bullets.size() < 4) {
					bullets.add(new Bullet(e.getX()-5, ship.y, 10, 15, Color.RED, 0, 5));
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

			window.setVisible(true);
			
			ship = new Ship(getWidth()/2-25, getHeight() - 30, 50, 30, Color.GREEN, getWidth());
			
			addEnemies(8);
			
			tmr.start();

		

	}
	
	private void addEnemies(int num) {
		
		Random rnd = new Random();

				
		for(int i = 0; i < num; i++) {
			enemies.add(new Enemy(
							rnd.nextInt(getWidth()),
							i * 20 + 5,
							30,
							15,
							Color.ORANGE,
							getWidth(),
							10 * (rnd.nextBoolean() ? 1 : -1)
					
					));
		}
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(Enemy e : enemies)
			e.draw(g);
		for(Bullet b: bullets)
			b.draw(g);
		ship.draw(g);

	}

}
