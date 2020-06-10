package SwingObserver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.DoubleToIntFunction;

public class AngelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Don't do it, you might regret it!");
    }
}
