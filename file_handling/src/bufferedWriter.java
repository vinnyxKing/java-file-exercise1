import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriter {
    public static void main(String[] args) {
        File file2 = new File("C:\\test_wr2.txt");
        FileWriter fr2 = null;
        BufferedWriter bw = null;
        String data2 = "1234567";
        String dataWithNewLine = data2 + System.getProperty("line.separator");

        int noOfLines = 10;

        try {
            fr2 = new FileWriter(file2);
            bw = new BufferedWriter(fr2);

            for (int i = noOfLines; i>0; i--)
                bw.write(data2);// write all on one line
                bw.write("\n");
                bw.write(dataWithNewLine); //write all on separate lines

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                fr2.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    //code works, comment out bw.write data2
}
