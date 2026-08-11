public class Student {

    String name;
    int age;

    public Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public void info() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alejo", 21);
        Student student2 = new Student("Luisa", 20);
        Student student3 = new Student("Juan", 19);

        student1.info();
        student2.info();
        student3.info();
    }
}