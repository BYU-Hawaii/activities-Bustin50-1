import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Graphics;

public class Age extends JPanel {
	int age;
    boolean girl;

	public Age() {
		String input = JOptionPane.showInputDialog("What is you age?");
        age = Integer.parseInt(input);
        String gender = JOptionPane.showInputDialog("What is you gender? M/F");
        String girl = new String("F");
        String boy = new String("M");
        if (girl.equals(gender)) {

        }
	}

	@Override
	public void paintComponent(Graphics g) {
        if (age < 12) {
            //primary
        }
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new Age());
		window.setVisible(true);
	}
}