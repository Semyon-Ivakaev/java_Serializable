import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObj {
    public static void readObj() {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // можно сразу прописать Person person = (Person) ois.readObject();
            Object obj = ois.readObject();
            Person person = (Person) obj;
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Failed " + ReadObj.class);
        }
    }
}
