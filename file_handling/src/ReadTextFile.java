import java.io.*;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter on;
        on = new BufferedWriter(new FileWriter("command.txt"));

        on.write("So this is the first line of this file");
        on.write("\n another line");
        on.write("\n here is a third line");

        on.close();

        BufferedReader in;
        in = new BufferedReader( new FileReader("command.txt")); //wrap your buffered reader around a file reader

        String line;
        while ((line = in.readLine()) != null){
            System.out.println(line);
        } //it keeps reading every line so long as it is not null.
        in.close();
    }
}
