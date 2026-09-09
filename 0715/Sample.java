class A {
    A() {
        System.out.println("A:引数のないコンストラクタが実行されました");
    }
    A(int x) {
        System.out.println("A:引数が1つのコンストラクタが実行されました");
    }
}

class B extends A {
    B(int x) {
        super();
    }
}

public class Sample {
    public static void main(String[] args) {
        B b = new B();
    }
}
