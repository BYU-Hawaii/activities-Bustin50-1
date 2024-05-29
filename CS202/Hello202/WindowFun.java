import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class WindowFun extends JPanel {
    public void paintComponent(Graphics g) {
        g.drawString("CIS 202", 10, 10);
        g.drawString("But I like CIS 101 too.", 10, 30);
        g.drawString("But I like CIS 101 too.", 20, 50);
    }
    public static void main(String[] args) {
        var window = new JFrame();

        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new WindowFun());
        window.setVisible(true);


    }
    
}

