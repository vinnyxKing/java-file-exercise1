import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {
    public static void main(String[] args) {
        File file = new File("d:\\test_wr.txt");
        FileWriter fr = null;

        try {
            fr = new FileWriter(file);
            fr.write('A');
            fr.write(67); // this will be printed as an ascii code
            fr.write("456");
        }catch (IOException e){
            e.printStackTrace();
        }finally {

            try {
                fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        // code works just make sure to create path on your pc
    }
}
