import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObj {
    public static void writeObjMethode1(Person[] people){
        System.out.println("Start writeObjMethode1");
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);

            for (Person person: people) {
                oos.writeObject(person);
            }
            fos.close();
            oos.close();
            System.out.println("Success writeObjMethode1");
        } catch (IOException e) {
            System.out.println("Failed" + WriteObj.class);
        } finally {
            System.out.println("End writeObjMethode1\n");
        }
    }

    public static void writeObjMethode2(Person[] people) {
        System.out.println("Start writeObjMethode2");
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);

            fos.close();
            oos.close();
            System.out.println("Success writeObjMethode2");
        } catch (IOException e) {
            System.out.println("Failed" + WriteObj.class);
        } finally {
            System.out.println("End writeObjMethode2\n");
        }
    }
}
