public class Person {

    String name;
    static int totalPersons;

    public Person(String name) {
        this.name = name;
        Person.totalPersons += 1;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alejo");
        Person person2 = new Person("Luisa");
        Person person3 = new Person("Juan");

        System.out.println(Person.totalPersons);
    }
}
