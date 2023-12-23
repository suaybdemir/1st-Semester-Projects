import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
MyFrame()
{
	
    this.setTitle("Hello World");
    this.setVisible(true);
    this.setResizable(false);
    this.setSize(420,420);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ImageIcon image = new ImageIcon("logo.png");
    this.setIconImage(image.getImage());
    this.getContentPane().setBackground(new Color(123,50,250));
    
}

}
