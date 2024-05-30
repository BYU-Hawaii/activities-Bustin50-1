import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class MyCastle extends JPanel {
	
	public MyCastle() {
		//Your custom initialization code here
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.blue);
        var w = getWidth();
        var h = getHeight();
        var cy = 0;
    

        g.setColor(Color.CYAN);
        g.fillRect(0, 0, w, h);

        g.setColor(Color.green);
        g.fillRect(0, 190, w, h-190);

        g.setColor(Color.BLUE);
        g.fillRect(0, 230, w, h-230);

        g.setColor(Color.green);

        for (int i = 0; i <= w; i = i + 10) {
            g.fillOval(i, 225, 10, 10);
        }

        g.setColor(Color.WHITE);
        g.fillOval(50, 25, 80, 40);
        g.fillOval(120, 35, 30, 30);
        g.fillOval(100, 15, 60, 35);

        g.setColor(Color.magenta);
        g.fillRect(20, 160, 50, 20);
        g.setColor(Color.BLACK);
        g.fillRect(43, 180, 4, 30);
        g.drawString("Justin's", 25,175);

        g.setColor(Color.lightGray);
        g.fillRect(100, cy+100, 100, 100);
        g.fillRect(90, cy+75, 30, 50);
        g.fillRect(180, cy+75, 30, 50);
        g.fillRect(85, cy+70, 10, 10);
        g.fillRect(100, cy+70, 10, 10);
        g.fillRect(115, cy+70, 10, 10);
        g.fillRect(175, cy+70, 10, 10);
        g.fillRect(190, cy+70, 10, 10);
        g.fillRect(205, cy+70, 10, 10);
        g.setColor(Color.yellow);
        g.fillOval(135, cy+150, 30, 30);
        g.fillRect(135, cy+165, 30, 35);


    }


	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new MyCastle());
		window.setVisible(true);
	}
}