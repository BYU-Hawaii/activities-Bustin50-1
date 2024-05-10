import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPain;
import java.awt.Graphics;
import java.awt.Color;

public class AsteroidB612 extends JPanel {
	ImageIcon sheep;
	String sheepChoice;
	public AsteroidB612() {

		sheep = new ImageIcon("sheep.png");
		sheepChoice = JOptionPain.showInputDialog("does the prince want sheep? (Y/N)");


	}

	@Override
	public void paintComponent(Graphics g) {
		int dx = -100;
		
		//draw the inky black expanse of outer space
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 400, 400);
		
		//draw the asteroid
		g.setColor(Color.GRAY);
		g.fillOval(-200, 200, 800, 800);
		
		//draw the boy's head
		g.setColor(new Color(173,112,64));
		g.fillOval(dx+175, 50, 50, 50);
		
		//draw his clothes
		g.setColor(Color.GREEN);
		g.fillRect(dx+170, 100, 60, 90);	//shirt
		g.fillRect(dx+170, 190, 20, 70);	//one leg
		g.fillRect(dx+210, 190, 20, 70);	//other leg
		
		//draw a mustard stain on his shirt
		g.setColor(Color.YELLOW);
		g.fillOval(dx+175, 120, 10, 15);

		if (sheepChoice.equals("y")){
			sheep.paintIcon(null, g, dx+10, 250);
		}
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new AsteroidB612());
		window.setVisible(true);
	}
}