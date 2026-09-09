class StudentCard {
    static int counter = 0;     // クラス変数
    int id;      // 学籍番号     // インスタンス変数
    String name; // 氏名        // インスタンス変数

    // コンストラクタ
    StudentCard(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // クラスメソッド
    static double getTriangleArea(double base, double height) {
        return base * height / 2.0;
    } 
}

public class InstanceMethodExample2 {
    public static void main(String[] args) {
        StudentCard.counter = 200;
        System.out.println(StudentCard.counter);

        double area = StudentCard.getTriangleArea(10, 100);
        System.out.println(area);

        StudentCard sc = new StudentCard(123, "山田太郎");
        System.out.println(sc.id);
        System.out.println(sc.name);

    }
}
