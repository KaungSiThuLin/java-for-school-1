public class Pratice3_3 {
    public static void main(String[] args) {
        int sum = 0; // 例として15を設定
        for (int i = 10; i <= 20; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("1から20までの3または5の倍数の和: " + sum);
    }
}
