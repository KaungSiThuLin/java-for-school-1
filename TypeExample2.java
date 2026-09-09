public class TypeExample2 {
    public static void main(String[] args) {
        // double : 8バイト
        double d = 9.8;
        // int : 4バイト
        //       ↓ キャスト
        int i = (int)d;

        System.out.println("dの値は" + d);
        System.out.println("iの値は" + i);

        int j = 5;
        double d2 = 0.5;
        System.out.println(j + d2);
    }
}