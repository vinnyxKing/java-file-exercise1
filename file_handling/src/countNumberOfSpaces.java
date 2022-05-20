import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class countNumberOfSpaces {
    public static void main(String[] args) throws IOException {
        FileWriter in;
        in = new FileWriter("FileIn.txt");
        int ch, total, spaces;

        in.write("This is what is in this file"); // open the file and write in it
        in.close(); // close the file

        FileReader up;
        up = new FileReader("FileIn.txt"); //instatiate a reader class

        spaces = 0;

        for (total = 0; (ch = up.read()) != -1; total++){
            if (Character.isWhitespace((char) ch))
                spaces++;
        }
        System.out.println(total + "Chars " + spaces + " spaces");
        in.close();
        //code works
    }
}
