import java.io.*;

public class FileStream {
    public static void main(String[] args) {

        try {
            File inFile = new File("/Users/liuyaqing/Desktop/chris.txt");
            File outFile = new File("file2.rtf");
            FileInputStream fis = new FileInputStream(inFile);
            FileOutputStream fos = new FileOutputStream(outFile);
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileStreamTest:" + e);
        } catch (IOException e) {
            System.err.println("FileStreamTest:" + e);
        }
    }
}
