package SwingLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.System.out;

public class TextToConsole {
    private JTextField textfiled;
    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    public static void main(String[] args) {
        TextToConsole program = new TextToConsole();
        program.go();
    }

    public void go(){
        textfiled = new JTextField(20);
        textfiled.addKeyListener(new TextListener());

        label = new JLabel("Type your text:");

        panel = new JPanel();
        panel.add(label);
        panel.add(textfiled);

        frame = new JFrame("TextToConsole");
        frame.setContentPane(panel);
        frame.setSize(500, 500);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static class TextListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            out.print(e.getKeyChar());
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
