// StudentCardクラスの宣言
// 親クラス
public class StudentCard {
    int id;      // 学籍番号保存用
    String name; // 氏名保存用

    void printInfo() {
        System.out.println("学籍番号:" + this.id);
        System.out.println("名前:" + this.name);
    }
}