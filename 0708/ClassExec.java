public class ClassExec {
    public static void main(String[] args) {
        // クラス変数を使ってみる
        ClassExample.price = 120;
        System.out.println(ClassExample.price);

        // クラスメソッドを使ってみる
        int sum = ClassExample.sum(10, 10, 10);
        System.out.println(sum);

        // インスタンスの生成(コンストラクタに引数２つを渡している)
        ClassExample ce = new ClassExample(10, "こんにちは");

        // インスタンス変数を使ってみる
        System.out.println(ce.num);
        System.out.println(ce.message);

        // インスタンスメソッドを使ってみる
        int result = ce.add(10, 20);
        System.out.println(result);
    }
}
