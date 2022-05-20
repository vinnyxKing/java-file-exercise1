import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class providingFileObject {
    public static void main(String[] args) {
        String filename = "d:\\textfile.txt";

        File rdfl = new File(filename);

        if (rdfl.exists()){
            FileReader readfile = null;
            try {
                readfile = new FileReader(rdfl);
                int data;

                while ((data = readfile.read()) != -1)
                    System.out.println((char) data);
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                try {
                    readfile.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        } else
            System.out.println("This file you are trying to open at " + rdfl.getAbsolutePath() + " does not exist !!!");
        // since the file does not exist, the above will be the output

        //code works
    }
}
