package NetworkConnection;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import static java.lang.System.out;
public class DailyAdvicerServer {
    String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat.",
        "One word: inappropriate", "Just for today, be honest. Tell your boss what you *really* think",
            "You might want to rethink that haircut."};
    public void go(){
        try{
            ServerSocket serverSocket = new ServerSocket(4242);
            while (true){
                Socket sock = serverSocket.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                out.println(advice);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public String getAdvice(){
        int random = (int)(Math.random()*adviceList.length);
        return adviceList[random];
    }
}
