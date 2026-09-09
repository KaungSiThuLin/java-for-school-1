// StudentCardクラスの子クラス
public class IStudentCard extends StudentCard {
    String nationality;     // 国籍

    // printInfoメソッドを改造します(オーバーライド)
    void printInfo() {
        super.printInfo();
        System.out.println("国籍:" + this.nationality);
    }
}
