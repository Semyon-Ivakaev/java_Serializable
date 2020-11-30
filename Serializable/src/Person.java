import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String family;

    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String toString() {
        return name + " " + family;
    }
}
