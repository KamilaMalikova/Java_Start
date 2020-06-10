package SwingObserver;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go(){
        frame = new JFrame();
        frame.getRootPane().setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocation(200, 200);
        frame.setVisible(true);
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(e -> System.out.println("Come on, do it!"));
        frame.add(button);
    }
}
