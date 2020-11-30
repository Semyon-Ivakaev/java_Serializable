import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObj {
    public static void writeObj(Person person) {
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person);
            oos.close();
            System.out.println("Succsess");
        } catch (IOException e) {
            System.out.println("Failed" + WriteObj.class);
        }
    }
}
