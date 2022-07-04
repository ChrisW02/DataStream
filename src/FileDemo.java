import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("/Users/liuyaqing/Desktop/ByteStream/file1.txt");
        File f2 = new File("/Users/liuyaqing/Desktop/ByteStream", "file3.txt");
        File f3 = new File("/Users/liuyaqing/Desktop/ByteStream" + File.separator + "project");
        File f4 = new File(f3, "file4.txt");

        try {
            System.out.println(f1);
            System.out.println(f2.createNewFile());
            System.out.println(f3.delete());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File[] files = File.listRoots();
        for (File file : files) {
            System.out.println(file);
            if (file.length() > 0) {
                String[] filenames = file.list();
                assert filenames != null;
                for (String filename : filenames) System.out.println(filename);
            }
        }
    }
}
