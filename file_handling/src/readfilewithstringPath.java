import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readfilewithstringPath {
    public static void main(String[] args) {

        String filename = "d:\\test.txt";

        FileReader readFile = null;

        try {
            readFile = new FileReader(filename);

            int data;
            while ((data = readFile.read()) != -1)
                System.out.println((char) data);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                readFile.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        //code only works when the path actually exists on your pc.
        // so make sure it exists before running it
    }
}
