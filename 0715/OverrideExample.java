public class OverrideExample {
    public static void main(String[] args) {
        StudentCard sc = new StudentCard();
        sc.id = 1234;
        sc.name = "山田太郎";
        sc.printInfo();

        IStudentCard isc = new IStudentCard();
        isc.id = 5678;
        isc.name = "John Smith";
        isc.nationality = "イギリス";
        isc.printInfo();
    }
}
