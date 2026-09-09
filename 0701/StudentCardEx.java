// StudentCardクラスの宣言
public class StudentCardEx {
    int id;      // 学籍番号保存用
    String name; // 氏名保存用

    // コンストラクタ
    StudentCardEx(int id, String name) {
        System.out.println("StudentCardクラスのコンストラクタが呼び出されました");
        this.id = id;
        this.name = name;
    }
}