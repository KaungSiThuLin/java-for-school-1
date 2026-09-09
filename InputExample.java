import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // 入力を受け付ける部品を作る
        Scanner in = new Scanner(System.in, "MS932");
        System.out.println("あなたのお名前は？");
        // 実際に入力を受け付ける
        String name = in.next();
        System.out.println(name + "さん、こんにちは。");
        // 部品を使い終わったら閉じる
        in.close();
    }
}