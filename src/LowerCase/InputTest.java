package LowerCase;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import static java.lang.System.out;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\Java_start\\head_first\\src\\LowerCase\\test.txt")));
            while ((c = in.read()) >= 0){
                out.print((char)c);
            }
            in.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

}

