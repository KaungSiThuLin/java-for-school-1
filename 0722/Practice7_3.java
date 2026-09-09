class H {}              // A
class I extends H {}    // B
class J {}              // C

public class Practice7_3 {
    public static void main(String[] args) {
        // (1) : 〇
        // H h = new H();
        // (2) : 〇
        // H h = new I();
        // (3) : ✕
        // H h = new J();
        // (4) : ✕
        // I i = new H();
        // (5) : 〇
        // I i = new I();
        // (6) : ✕
        // I i = new J();
    }
    
}
