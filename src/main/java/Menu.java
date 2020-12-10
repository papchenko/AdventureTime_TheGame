import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Menu extends WindowApp {

    JMenuBar jMenuBar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu options = new JMenu("Options");
    JMenu about = new JMenu("About");

    void menu() {
        jMenuBar.add(file);
        jMenuBar.add(options);
        jMenuBar.add(about);
        jFrame.setJMenuBar(jMenuBar);

        JMenuItem newgame = file.add(new JMenuItem("New Game", new ImageIcon(getClass().getResource("Menu/newgame.png"))));
        newgame.setEnabled(false);

        file.addSeparator();
        JMenu listenmusic = new JMenu("Listen Music :)");
        file.add(listenmusic);
        listenmusic.add("chill out").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=ql4S8z1jW8I").toURI());
                } catch (Exception ee) {
                }
            }
        });
        listenmusic.add("ambient").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=tNkZsRW7h2c").toURI());
                } catch (Exception ee) {
                }
            }
        });
        listenmusic.add("trance").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=WYetg3AuLE4").toURI());
                } catch (Exception ee) {
                }
            }
        });
        listenmusic.add("house").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=MWxPC9bWIpI").toURI());
                } catch (Exception ee) {
                }
            }
        });

        listenmusic.add("hardcore").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=H1YUIjZr1fA").toURI());
                } catch (Exception ee) {
                }
            }
        });

        file.addSeparator();

        JMenuItem exit = file.add(new JMenuItem("Exit", new ImageIcon(getClass().getResource("Menu/exit.png"))));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));

        JMenuItem language = options.add(new JMenuItem("Language", new ImageIcon(getClass().getResource("Menu/language.png"))));
        language.setEnabled(false);

        about.add(new JMenuItem("Help", new ImageIcon(getClass().getResource("Menu/help.png"))));
        about.addSeparator();

        about.add(new JMenuItem("Contacts", new ImageIcon(getClass().getResource("Menu/contacts.png"))));


        jFrame.revalidate();

    }
}
