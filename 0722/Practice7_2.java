class X {
    // 引数なしコンストラクタ
    X() {
        System.out.println("[X]");
    }
    // メソッド
    void a() {
        System.out.println("[x.a]");
    }
    void b() {
        System.out.println("[x.b]");
    }
}

class Y extends X {
    // 引数なしコンストラクタ
    Y() {
        System.out.println("[Y]");
    }
    // メソッド
    void a() {
        System.out.println("[y.a]");
    }
}
public class Practice7_2 {
    public static void main(String[] args) {
        X x = new X();
        x.a();
        x.b();
        Y y = new Y();
        y.a();
        y.b();
    }
}
