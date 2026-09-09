public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();
        Teacher t = new Teacher();
        Car c = new Car();

        Person s2 = new Student();
        Person t2 = new Teacher();

        Person[] persons = new Person[3];
        persons[0] = new Person();
        persons[1] = new Student();
        persons[2] = new Teacher();

        Person person = new Teacher();
        // ↓ これはエラーになります
        // なぜならPersonクラスは、
        // makeTestメソッドをもっていないからです
        // person.makeTest();
        person.work();

        Person person2 = new Student();
        person2.work();
    }
}
