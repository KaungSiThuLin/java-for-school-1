class StudentCard {
    // ================================
    // フィールド
    // ================================
    static int counter = 0;     // クラス変数
    int id;      // 学籍番号     // インスタンス変数
    String name; // 氏名        // インスタンス変数

    // ================================
    // コンストラクタ
    // ================================
    StudentCard(int id, String name) {
        this.id = id;
        this.name = name;
        StudentCard.counter++;
    }

    // ================================
    // クラスメソッド
    // ================================
    // 構文 : static 戻り値 メソッド名(引数列) { 処理内容 }
    // 三角形の面積を戻り値で返すクラスメソッド
    // base : 底辺
    // height : 高さ
    static double getTriangleArea(double base, double height) {
        return base * height / 2.0;
    } 

    // ================================
    // インスタンスメソッド
    // ================================
    void printInfo() {
        System.out.println("学籍番号：" + this.id);
        System.out.println("氏名：" + this.name);
    }
}

public class InstanceMethodExample {
    public static void main(String[] args) {
        System.out.println("この時点でのインスタンスの数 : " + StudentCard.counter);
        StudentCard a = new StudentCard(1234, "鈴木太郎");
        System.out.println("この時点でのインスタンスの数 : " + StudentCard.counter);
        StudentCard b = new StudentCard(1235, "佐藤花子");
        System.out.println("この時点でのインスタンスの数 : " + StudentCard.counter);
        //a.printInfo();
        //b.printInfo();
        double area = StudentCard.getTriangleArea(10, 5);
        System.out.println("底辺が10、高さが5の三角形の面積は" + area + "です。");
    }
}
