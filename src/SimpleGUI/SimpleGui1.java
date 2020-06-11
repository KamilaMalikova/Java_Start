package SimpleGUI;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui1 implements ControllerEventListener {

    private JButton colorButton;
    private JFrame frame;
    private JButton labelButton;
    private JLabel label;
    private boolean msg = false;

    public static void main(String[] args) {
        SimpleGui1 gui = new SimpleGui1();
        gui.go();
    }

    @Override
    public void controlChange(ShortMessage event) {
        msg = true;
        frame.repaint();
    }

    public void go(){
        frame = new JFrame();

        //color button
        colorButton = new JButton("click me");
        colorButton.setSize(30, 30);
        colorButton.setLocation(120, 120);
        colorButton.addActionListener(new ColorListener());

        //label
        label = new JLabel("This's label");

        //label button
        labelButton = new JButton("Change label");
        labelButton.addActionListener(new LabelListeber());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 500);
        frame.setLocation(300, 300);

        MyDrawingPanel drawingPanel = new MyDrawingPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawingPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setVisible(true);
//        drawingPanel.paintComponent(frame.getGraphics());
    }

    class LabelListeber implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (label.getText() == "Ouch") label.setText("Again");
            else label.setText("Ouch");
        }
    }
    class ColorListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    public class MyDrawingPanel extends JPanel{

        public void paintComponent(Graphics g){
            //Graphics g = new Graphics2D();
            if (msg){
            g.setColor(Color.orange);
            g.fillRect(20, 50, 100, 100);

            //display image
            Image image = new ImageIcon("1.png").getImage();
            g.drawImage(image, 3, 4, this);

            //randomly-colored circle
            g.fillRect(0,0,this.getWidth(), this.getHeight());

            int red = (int)(Math.random() *255);
            int green = (int)(Math.random() *255);
            int blue = (int)(Math.random() *255);

            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);
            g.fillOval(70, 70, 100, 100);

            //Gradient
            Graphics2D g2d = (Graphics2D)g;

            GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
            g2d.setPaint(gradient);
            g2d.fillOval(70, 70, 100, 100);

            red = (int)(Math.random() *255);
            green = (int)(Math.random() *255);
            blue = (int)(Math.random() *255);
            Color startColor = new Color(red, green, blue);

            red = (int)(Math.random() *255);
            green = (int)(Math.random() *255);
            blue = (int)(Math.random() *255);
            Color endColor = new Color(red, green, blue);

            gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
            g2d.setPaint(gradient);
            g2d.fillOval(70,70, 100, 100);
            }
        }
    }


}
