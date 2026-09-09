// StudentCardクラスの宣言
class StudentCard {
    int id;      // 学生番号保存用
    String name; // 氏名保存用

    // コンストラクタを追加
    StudentCard(int id, String name) {
        // 初期化を行う命令
    }
}

public class NullExample {
    public static void main(String[] args) {
        // StudentCardのインスタンス配列を生成(作成)する
        StudentCard[] cards = new StudentCard[3];   // StudentCardクラスの配列の宣言
        // cards[0],[2]についてはノータッチ
        // cards[1] = new StudentCard();   // 添え字1番目にStudentCardのインスタンスを生成する
        // cards[1].id = 1235; // インスタンスのメンバ変数idに1235を代入
        // cards[1].name = "佐藤花子"; // インスタンスのメンバ変数nameに佐藤花子を代入

        // cards[0] = new StudentCard();
        // cards[0].id = 1111;

        // StudentCard配列の個数分ループ
        for(int i = 0; i < 3; i++) {
            // nullのチェックをする
            if(cards[i] == null) {
                System.out.println("cards[" + i + "]は参照がありません");
            } else {
                System.out.println("cards[" + i + "]のidは" + cards[i].id + 
                                        "、nameは" + cards[i].name);
            }
        }
    }
}
