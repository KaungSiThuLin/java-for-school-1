public class PersonSample {
    public static void main(String[] args) {
        Person p = new Person();
        p.work();

        Student s = new Student();
        s.work();

        Teacher t = new Teacher();
        t.work();
        t.makeTest();
    }
}
