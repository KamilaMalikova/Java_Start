package NetworkConnection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClient {
    JTextField outgoing;
    PrintWriter writer;
    JButton btnSend;
    Socket sock;
    JFrame frame;
    JPanel panel;
    public void go(){
        frame = new JFrame("Chat client");
        panel = new JPanel();
        btnSend= new JButton("Send");
        btnSend.addActionListener(new SendButtonListener());
        outgoing = new JTextField();
        panel.add(outgoing);
        panel.add(btnSend);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocation(20, 20);
        frame.setVisible(true);

    }
    public void setUpNetworking(){
        if (!outgoing.getText().isEmpty()){
            
        }
    }

    public class SendButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            setUpNetworking();
        }
    }
}
