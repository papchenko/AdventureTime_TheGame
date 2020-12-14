import javax.swing.*;
import java.awt.*;

public class WindowApp {

    static JFrame jFrame = new JFrame();
    ImageIcon icon = new ImageIcon(WindowApp.class.getResource("WindowApp/icon.png"));
    String title = "Adventure Time <THE GAME>";
    JPanel jPanel = new JPanel();

    void window() {
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(580, 390);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setTitle(title);
        jFrame.setIconImage(icon.getImage());
        jFrame.add(jPanel);
        jPanel.setBackground(Color.DARK_GRAY);


    }

    void appMenu() {
        Menu menu = new Menu();
        menu.menu();

        PicturesOnTop picOnTop = new PicturesOnTop();
        picOnTop.paintComponent(jFrame.getGraphics());

    }
}
