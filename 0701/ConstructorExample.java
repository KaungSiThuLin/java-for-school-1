// StudentCardクラスの宣言
class StudentCardEx {
    // メンバ変数、フィールド(変数)、情報(値)、インスタンス変数、クラス変数
    int id;      // 学籍番号保存用
    String name; // 氏名保存用

    // 引数のないコンストラクタです
    StudentCardEx() {
        System.out.println("引数のないコンストラクタが実行されました");
        this.id = 0;
        this.name = "未定";
    }

    // 1つの文字列を引数とするコンストラクタです
    StudentCardEx(String name) {
        System.out.println("引数が１つのコンストラクタが実行されました");
        this.id = 0;
        this.name = name;
    }

    StudentCardEx(int id, String name) {
        System.out.println("引数が２つのコンストラクタが実行されました");
        this.id = id;
        this.name = name;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // ====================================
        // オーバーロードのテクニック
        // ====================================
        // 引数なしのコンストラクタを実行
        StudentCardEx sc1 = new StudentCardEx();
        System.out.println("sc1のidの値は" + sc1.id);
        System.out.println("sc1のnameの値は" + sc1.name);

        // 引数がString型１つのコンストラクタを実行
        StudentCardEx sc2 = new StudentCardEx("鈴木太郎");
        System.out.println("sc2のidの値は" + sc2.id);
        System.out.println("sc2のnameの値は" + sc2.name);

        // 引数がint型１つ、String型１つのコンストラクタを実行
        StudentCardEx sc3 = new StudentCardEx(1235, "佐藤花子");
        System.out.println("sc3のidの値は" + sc3.id);
        System.out.println("sc3のnameの値は" + sc3.name);

        // ここがうまく動かない
        // StudentCard b = new StudentCard(777, "清風二郎");
        // System.out.println("bのidの値は" + b.id);
        // System.out.println("bのnameの値は" + b.name);
    }
}
