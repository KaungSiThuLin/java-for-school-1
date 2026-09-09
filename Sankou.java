public class Sankou {
    public static void main(String[] args) {
        // 10 > 5
        // if(a > b) {
        //     // c = 10
        //     c = a;
        // } else {
        //     c = a;
        // }
        // 条件式 ? 値1 : 値2
        int a = 10;
        int b = 5;
        int c = 0;
        //  10 < 5  ? 10 : 5;
        c = (a < b) ? a : b;
        System.out.println(c);
    }
}
