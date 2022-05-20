import java.io.*;

public class fileWriting {
    public static void main(String[] args) throws IOException {

        String [] names = {"Vincent", "Matthew", "Yohnathan"};

        BufferedWriter writer = new BufferedWriter(new FileWriter("firstwrite.txt"));


        writer.write("This is my first text");
        writer.write("\nThis is a second text to this file");

        for (String name : names){
            writer.write("\n" + name);
        }
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("firstwrite.txt"));

        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }

        reader.close();

    }
}
