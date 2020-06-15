package NetworkConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class SimpleChatClient {
    JTextField outgoing;
    JTextArea incoming;
    PrintWriter writer;
    JButton btnSend;
    Socket socket;
    JFrame frame;
    JPanel panel;
    BufferedReader reader;

    public void go(){
        frame = new JFrame("Chat client");
        panel = new JPanel();
        btnSend= new JButton("Send");
        btnSend.addActionListener(new SendButtonListener());
        outgoing = new JTextField(20);
        incoming = new JTextArea(15, 50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(qScroller);
        panel.add(outgoing);
        panel.add(btnSend);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUpNetworking();

        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.setSize(500, 500);
        frame.setLocation(20, 20);
        frame.setVisible(true);


    }
    public  void setUpNetworking(){
            try{
                socket = new Socket("127.0.0.1", 5000);
                writer = new PrintWriter(socket.getOutputStream());
                InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
                reader = new BufferedReader(streamReader);
                out.println("networking established");
            }
            catch (Exception ex){
                out.println("Didn't set connection");
                ex.printStackTrace();
            }
    }

    public class SendButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                writer.println(outgoing.getText());
                writer.flush();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public class IncomingReader implements Runnable {
        public void run() {
            String message;
            setUpNetworking();
            try {
                while ((message = reader.readLine()) != null) {
                    incoming.setText(message);
                    System.out.println("read " + message);
                    incoming.append(message + "\n");
                } // close while
            } catch(Exception ex) {ex.printStackTrace();}
        } // close run
    } // close inner class

    public static void main(String[] args) {
        SimpleChatClient client = new SimpleChatClient();
        client.go();

    }
}
