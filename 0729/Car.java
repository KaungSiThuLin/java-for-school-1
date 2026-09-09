class Car {
    // フィールド変数、メンバ変数の宣言しているところ
    private int speed; // privateは、外部からアクセスできません
    public int speed2; // publicは、外部からアクセスできる

    public final static double PI = 3.14;
    public final static int ADULT_AGE = 18;
    public final static String DB_URL = "192.168.22.200";
    public final static String DB_PORT = "3306";

    // (メンバ)メソッド
    public void speedUp() {
        if(speed < 80) {
            speed++;
        }
    }

    public void speedDown() {
        if(speed > 0) {
            speed--;
        }
    }
}
