import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObj {
    public static void readObjMethod1() {
        System.out.println("Start readObjMethod1");
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int countObj = ois.readInt();
            Person[] people = new Person[countObj];

            for (int i = 0; i < countObj; i++){
                people[i] = (Person) ois.readObject();
            }

            fis.close();
            ois.close();
            System.out.println(Arrays.toString(people));
            System.out.println("Success readObjMethod1");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Failed" + ReadObj.class);
        } finally {
            System.out.println("End readObjMethod1\n");
        }
    }

    public static void readObjMethod2() {
        System.out.println("Start readObjMethod2");
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person[] people = (Person[]) ois.readObject();

            fis.close();
            ois.close();
            System.out.println(Arrays.toString(people));
            System.out.println("Success readObjMethod12");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Failed" + ReadObj.class);
        }finally {
            System.out.println("End readObjMethod2\n");
        }

    }
}
