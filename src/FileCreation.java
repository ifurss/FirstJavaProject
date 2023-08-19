import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileCreation {



    public static void fileRead(){
        char[] buf = null;
        try (FileReader reader = new FileReader("D:\\from.txt")) {
            buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {

                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Encryption.encryption(buf);
    }
}
