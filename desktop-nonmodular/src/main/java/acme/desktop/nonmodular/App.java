package acme.desktop.nonmodular;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Hello World!"));

        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}