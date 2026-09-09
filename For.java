public class For {
    public static void main(String[] args) {
        int sum = 0;
        int abc = 123;

        for(int i = 0; i <= 10; i++) {
            if(i == 0) {
                
            }
            sum += i;
            System.out.println(i + "を加えました");
        }
        System.out.println("合計は" + sum + "です");
        System.out.println(abc);
    }
}
