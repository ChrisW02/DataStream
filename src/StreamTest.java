import java.io.*;
// Generally, we do not use InputStream or OutputStream.
// Because they are low-level.

public class StreamTest {
    public void copy(InputStream in, OutputStream out) throws IOException {
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        // .read one by one, ends with -1
        while (len != -1) {
            out.write(buf, 0, len);
            len = in.read(buf);
        }
    }

    public static void main(String[] args) throws IOException {
        StreamTest t = new StreamTest();
        System.out.println("Input: ");
        t.copy(System.in, System.out);
    }
}
