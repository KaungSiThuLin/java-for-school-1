// Classの構造
public class ClassExample {
    // =============================
    // フィールド(変数、情報)
    // =============================

    // ■インスタンス変数
    int num;
    String message;

    // ■クラス変数
    static int price = 0;

    // =============================
    // コンストラクタ(初期化処理をするメソッドみたいなモノ)
    // =============================
    ClassExample(int num, String message) {
        this.num = num;
        this.message = message;
    }
    
    // =============================
    // メソッド(機能、関数みたいなモノ)
    // =============================

    // ■インスタンスメソッド
    int add(int x, int y) {
        return x + y;
    }

    // ■クラスメソッド
    static int sum(int x, int y, int z) {
        return x + y + z;
    }
}
