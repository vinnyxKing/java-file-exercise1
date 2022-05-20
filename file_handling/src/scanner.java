import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        File rdfile = new File("d:\\test123.txt");
        Scanner fs = null;

        try {
            fs = new Scanner(rdfile);
            System.out.println(fs.next());
            System.out.println(fs.nextDouble());
            System.out.println(fs.next());
            System.out.println(fs.nextInt());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            fs.close();
        }
    }
}
