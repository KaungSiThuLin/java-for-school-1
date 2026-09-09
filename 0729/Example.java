interface I {}
abstract class A {}
class B extends A {}
class C implements I {}

public class Example {
    public static void main(String[] args) {
        // 8章練習問題
        // 8.4
        A a = new A();  // (1) 誤り
        B b = new B();  // (2) 正しい
        C c = new C();  // (3) 正しい
        I i = new I();  // (4) 誤り
        A b2 = new B();  // (5) 正しい
        B a2 = new A();  // (6) 誤り
        I b3 = new B();  // (7) 誤り
        I c2 = new C();  // (8) 正しい
    }
}