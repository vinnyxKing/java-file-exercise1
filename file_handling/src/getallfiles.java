import java.io.File;

public class getallfiles {
    private static void getAllFiles(File curDir){
        File[] filesList = curDir.listFiles();

        for (File f : filesList){
            if (f.isDirectory())
                getAllFiles(f);
            if (f.isFile())
                System.out.println(f.getName());
        }
    }

    public static void main(String[] args) {
        File curDir = new File(".");
        getAllFiles(curDir);
    }


}
