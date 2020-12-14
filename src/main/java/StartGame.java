import javax.swing.*;
import java.awt.*;

public class StartGame extends JPanel {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Image im = new ImageIcon("C:\\Users\\Niko\\AdventureTime_TheGame\\src\\main\\resources\\StartGame\\startgame.png").getImage();
        g2.drawImage(im, 105, -40, this);

        Font font = new Font("Impact", Font.BOLD, 14);
        g2.setFont(font);
        g2.drawString("2020", 275, 350);
    }
}