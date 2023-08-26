import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileCreation {



    public static void fileRead(int operation){
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

        switch (operation){
            case 1 -> Encryption.encryption(buf);
            case 2 -> Decryption.decryption(buf);
            case 3 ->BrutalForce.brutalForceMethod(buf);
        }

    }


    public static void fileWrite(char[] array){
        char[] buf = null;
        try (FileWriter writer = new FileWriter("D:\\to.txt")) {
            buf = new char[256];
            int c;
            for (int i = 0; i < array.length; i++) {
                writer.write(array[i]);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
