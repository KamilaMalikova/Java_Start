package LowerCase;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.out;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream inputStream){
        super(inputStream);
    }

    public int read() throws IOException{
        int c = in.read();
        out.println(c);
        return (c == -1 ? 0 :Character.toLowerCase((char)c));
    }

    public int read(byte[] b, int offset, int len) throws IOException{
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset+result; i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }

}
