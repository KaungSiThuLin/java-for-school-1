public class PolymorphismExample {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person();
        persons[1] = new Student();
        persons[2] = new Teacher();

        // for(int i = 0; i < persons.length; i++ ) {
        //     persons[i].work();
        //     workThreeTimes(persons[i]);
        // }

        Person t = new Teacher();
        ((Teacher)t).makeTest();

        Person t2 = new Student();
        ((Teacher)t2).makeTest();
    }

    static void workThreeTimes(Person p) {
        p.work();
    }
}
