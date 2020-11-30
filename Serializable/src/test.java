

public class test {
    public static void main(String[] args) {
        Person person1 = new Person("Ilon", "Mask");

        WriteObj.writeObj(person1);
        ReadObj.readObj();
    }
}
