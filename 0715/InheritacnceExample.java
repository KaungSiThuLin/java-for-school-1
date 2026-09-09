public class InheritacnceExample {
    public static void main(String[] args) {
        IStudentCard isc = new IStudentCard();

        isc.id = 2345;
        isc.name = "John Smith";
        isc.nationality = "イギリス";

        isc.printInfo();
    }
}
