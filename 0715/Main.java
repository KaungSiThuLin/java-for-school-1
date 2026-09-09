class Rectangle {
    // メンバ変数
    double width;  // 幅
    double height; // 高さ

    // （1）幅と高さを引数で指定できる
    // コンストラクタを追加してください。
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // （2）面積（幅×高さ）を戻り値とする
    // インスタンスメソッドを追加してくださ
    // い。メソッド名はgetAreaとしてください。
    double getArea() {
        double area = this.width * this.height;
        return area;
    }

    //（3）引数で渡されたRectangleオブジェクトと
    // 比較して、自分の面積のほうが大きければtrueを、
    // そうでなければfalseを戻り値とする
    // isLargerという名前のインスタンスメソッドを追加してください。
    boolean isLarger(Rectangle rectangle) {
        // 自分自身の面積を求めます
        double thisArea = this.getArea();

        // 引数で渡ってきたRectangleの面積も求めます
        double paramArea = rectangle.getArea();

        // 面積を比較
        if(thisArea > paramArea) {
            // 自分の面積の方が大きければtrueを返す
            return true;

        } else {
            // そうでなければfalseを返す
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6, 23); // 長方形クラスのインスタンス その１ : 面積
        Rectangle r2 = new Rectangle(5,3); // 長方形クラスのインスタンス その２ : 面積

        System.out.println(r1.getArea());      // r1変数の面積
        System.out.println(r2.getArea());      // r2変数の面積

        // 自分の面積の方が大きければtrueを返す
        // そうでなければfalseを返す
        System.out.println(r1.isLarger(r2));   // r1とr2の面積の比較
    }
}
