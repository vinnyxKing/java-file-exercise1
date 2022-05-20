import java.io.FileInputStream;
import java.io.IOException;

public class f1 {

    public static void main(String[] args) throws IOException {
        FileInputStream in;
        in = new FileInputStream("InFIle.txt");

        int total = 0;
        while (in.read()!= -1)
            total++;
        System.out.println(total + "bytes");

        in.close();
    }


}
