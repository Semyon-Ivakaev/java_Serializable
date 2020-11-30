/*
Рассмотрим 2 метода добавления массива объектов в файл:
1-й метод подразумевает использование цикла над массивом и добавлением каждого объекта из него
в файл с последующем чтением этого файла так же с помощью цикла.

2-й метод проще и короче по коду, так как весь массив рассматриваем как объект и записываем его
в файл с последующем чтением этого массива.
 */

public class Main {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Clark"), new Person(2, "Bruce"),
                            new Person(3, "Peter")};

        WriteObj.writeObjMethode1(people);
        ReadObj.readObjMethod1();

        WriteObj.writeObjMethode2(people);
        ReadObj.readObjMethod2();
    }
}
