package MusicTester;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;

public class MyDrawingPanel extends JPanel implements ControllerEventListener {
    boolean msg = false;
    @Override
    public void controlChange(ShortMessage event) {
        msg = true;
        repaint();
    }

    public void paintComponent(Graphics g){
        //Graphics g = new Graphics2D();
        if (msg){
            g.setColor(Color.orange);

            //Gradient
            Graphics2D g2d = (Graphics2D)g;

            GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
            g2d.setPaint(gradient);
            g2d.fillOval(70, 70, 100, 100);

            int red = (int)(Math.random() *255);
            int green = (int)(Math.random() *255);
            int blue = (int)(Math.random() *255);
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
