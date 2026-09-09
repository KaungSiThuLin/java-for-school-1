class Person {
    void work() {
        System.out.println("人です。仕事します");
    }
}

class Student extends Person {
    void work() {
        System.out.println("学生です。勉強ます");
    }
}

class Teacher extends Person {
    void work() {
        System.out.println("教員です。授業をします");
    }

    void makeTest() {
        System.out.println("試験問題を作ります。");

    }
}