package FileStream;

import java.io.*;
import static java.lang.System.out;

public class Main implements Serializable {

    public static void main(String[] args) {
        Box box = new Box(50, 30);

        try {
            // Write and read serialized data

          /*  FileOutputStream fileStream = new FileOutputStream("game.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(box);
            os.close();*/
            FileInputStream fileInputStream = new FileInputStream("game.ser");
            ObjectInputStream os2 = new ObjectInputStream(fileInputStream);
            Object object = os2.readObject();
            os2.close();
            box = (Box)object;
            out.println(box.getWidth()+"-"+box.getHeight());

        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        /// File writer
        try {
            FileWriter writer = new FileWriter("file.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("hello");
            bufferedWriter.close();
            FileReader fileReader = new FileReader("file.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line= null;
            while ((line= reader.readLine()) !=null) {
                out.print(line);
            }
            reader.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
