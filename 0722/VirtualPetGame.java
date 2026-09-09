class VirtualPet {
    // =============================
    // フィールド(変数、情報)
    // =============================

    // ■インスタンス変数
    String name;    // 名前
    int maxEnergy;  // 最大体力
    int energy;     // 現在の体力

    // =============================
    // コンストラクタ(初期化処理をするメソッドみたいなモノ)
    // =============================
    VirtualPet(String name, int maxEnergy, int energy) {
        this.name = name;           // 名前
        this.maxEnergy = maxEnergy; // 最大体力
        this.energy = energy;       // 現在の体力
    }

    // =============================
    // メソッド(機能、関数みたいなモノ)
    // =============================
    // ■インスタンスメソッド
    void sleep() {
        System.out.println(this.name + "：よく寝た。体力が回復したよ。");
        this.energy = this.maxEnergy;   // 全回復 (変数energyに最大体力のmaxEnergyを代入)
    }

    void printInfo() {
        System.out.println("[状態出力]");
        System.out.println("名前：" + this.name);
        System.out.println("最大体力：" + this.maxEnergy);
        System.out.println("体力：" + this.energy);
    }

    void move() {
        // 後で継承先で処理をオーバーライドする
    }
}

class VirtualDog extends VirtualPet {
    VirtualDog(String name, int maxEnergy, int energy) {
        super(name, maxEnergy, energy);
    }

    // 親クラスのmoveメソッドをオーバーライドする
    void move() {
        if(this.energy < 10) {  // 体力が10未満のときの処理
            System.out.println(this.name + "：疲れちゃって、これ以上歩けないよ。");
        } else {
            System.out.println(this.name + "歩いたよ。体力が10減った。最大体力が1増えた。");
            this.energy -= 10; // 体力が10減る
            this.maxEnergy++;  // 最大体力が1増える
        }
    }
}

class VirtualBird extends VirtualPet {
    VirtualBird(String name, int maxEnergy, int energy) {
        super(name, maxEnergy, energy);
    }

    void move() {
        if(this.energy < 10) {
            System.out.println(this.name + "：疲れちゃった、これ以上飛べないよ。");
        } else {
            System.out.println(this.name + "：パタパタ。飛んだよ。体力が減った。最大体力が１増えた");
            this.energy -= 10; // 体力が10減る
            this.maxEnergy++;  // 最大体力が1増える
        }
    }
}

public class VirtualPetGame {

    public static void moveAndSleep(VirtualPet pet) {
        pet.move();
        pet.sleep();
    }
    public static void main(String[] args) {
        // タロ（犬）の実体を作っていきます
        VirtualDog taro = new VirtualDog("タロ", 100, 50);

        // ピヨ（鳥）の実体を作ていきます
        VirtualBird piyo = new VirtualBird("ピヨ", 60, 30);

        moveAndSleep(taro); // タロ（犬）：歩いたり寝たりさせてみる
        moveAndSleep(piyo); // ピヨ（鳥）：飛んだり寝たりさせてみる

        // タロ(taro)の情報を出力
        // taro.printInfo();
        // タロ(taro)の情報を出力
        // piyo.printInfo();
    }
}
