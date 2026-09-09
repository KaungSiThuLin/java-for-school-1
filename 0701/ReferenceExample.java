// ReferenceExample.java
public class ReferenceExample {
    // メソッドを作っていきます
    // StudentCardのインスタンスのメンバ変数の情報を表示
    static void printCardInfo(StudentCardEx card) {
        System.out.println("学籍番号 : " + card.id);
        System.out.println("氏名 : " + card.name);
    }

    // StudentCardのインスタンスのメンバ変数の情報を初期化する(変更)
    static void clearCardInfo(StudentCardEx card) {
        card.id = 0;
        card.name = "未定";
    }

    static StudentCardEx compareCards(StudentCardEx card0, StudentCardEx card1) {
        if(card0.id < card1.id) {
            return card0;
        } else {
            return card1;
        }
    }

    public static void main(String[] args) {
        // StudentCardを使えるようにするために
        // インスタンス化する
        StudentCardEx card0 = new StudentCardEx();
        card0.id = 1234;
        card0.name = "鈴木太郎";

        StudentCardEx card1 = new StudentCardEx();
        card1.id = 5678;
        card1.name = "清風太郎";

        StudentCardEx resultCard = null;
        resultCard = compareCards(card0, card1);
        printCardInfo(resultCard);

        // printCardInfo(card0);
        // clearCardInfo(card0);
        // printCardInfo(card0);
    }
}
