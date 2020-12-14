import javax.swing.*;
import java.awt.*;

public class PicturesOnTop extends JPanel {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
         Image im = new ImageIcon("C:\\Users\\Niko\\AdventureTime_TheGame\\src\\main\\resources\\PicturesOnTop\\picontop.png").getImage();
         g2.drawImage(im, -207, -350, this);

        Font font = new Font("Impact", Font.BOLD, 14);
        g2.setFont(font);
        g2.drawString("2020", 275, 350);
    }
}