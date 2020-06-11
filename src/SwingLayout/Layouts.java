package SwingLayout;

import javax.swing.*;
import java.awt.*;

public class Layouts {
    public static void main(String[] args) {
        Layouts gui = new Layouts();
     //   gui.goBorderLayout();
     //   gui.goFlowLayout();
        gui.goBoxLayout();
    }

    public void goBorderLayout(){
        Font bigFont = new Font("serif", Font.BOLD, 28);

        JFrame frame = new JFrame();

        JButton north = new JButton("North");
        north.setFont(bigFont);

        JButton east = new JButton("East");
        east.setFont(bigFont);

        JButton west = new JButton("West");
        west.setFont(bigFont);

        JButton south = new JButton("South");
        south.setFont(bigFont);

        JButton center = new JButton("Center");
        center.setFont(bigFont);

        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize( 500, 500);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void goFlowLayout(){
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("shock me");
        JButton button2 = new JButton("bliss");

        panel.add(button);
        panel.add(button2);

        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize( 500, 500);
        frame.setLocation(700, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void goBoxLayout(){
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("shock me");
        JButton button2 = new JButton("bliss");

        panel.add(button);
        panel.add(button2);

        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize( 500, 500);
        frame.setLocation(700, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
