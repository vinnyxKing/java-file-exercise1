import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile2 {
    public static void main(String[] args) {
        String filename = "d:\\test.txt";
        FileReader readfile = null;
        BufferedReader readstream = null;

        try {
            readfile = new FileReader(filename);
            readstream = new BufferedReader(readfile);

            String line;

            while ((line = readstream.readLine()) != null)
                System.out.println(line);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                readstream.close();
                readfile.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    //code works, make sure the path exists on your pc
}
