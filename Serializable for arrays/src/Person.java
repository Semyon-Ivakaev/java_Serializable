import java.io.Serializable;

public class Person implements Serializable {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return id + ": " + name;
    }
}
