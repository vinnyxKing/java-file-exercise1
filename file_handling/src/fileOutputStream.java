import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {

    public static void main(String[] args) {
        byte cities [] = {'M', 'e', 'l', 'b', 'o','u', 'r', 'n', 'e',
        '\n', 'S', 'y', 'd', 'n', 'e', 'y'};

        FileOutputStream outFile;
        try {
            outFile = new FileOutputStream("City.txt");
            outFile.write(cities);
            outFile.close();
        } catch (IOException e) {
          System.out.println(e);
          System.exit(-1);
        }
    }


}
