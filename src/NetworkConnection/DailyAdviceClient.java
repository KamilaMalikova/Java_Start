package NetworkConnection;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.SocketHandler;
import java.net.*;
import static java.lang.System.out;

public class DailyAdviceClient {
    public void go(){
        try{
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            String advice = reader.readLine();
            out.println("Today you should: "+advice);
            reader.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
