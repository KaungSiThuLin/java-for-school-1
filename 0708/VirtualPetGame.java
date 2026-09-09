class VirtualDog {
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
    VirtualDog(String name, int maxEnergy, int energy) {
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

    void walk() {
        if(this.energy < 10) {  // 体力が10未満のときの処理
            System.out.println(this.name + "：疲れちゃって、これ以上歩けないよ。");
        } else {
            System.out.println(this.name + "歩いたよ。体力が10減った。最大体力が1増えた。");
            this.energy -= 10; // 体力が10減る
            this.maxEnergy++;  // 最大体力が1増える
        }
    }

    void printInfo() {
        System.out.println("[状態出力]");
        System.out.println("名前：" + this.name);
        System.out.println("最大体力：" + this.maxEnergy);
        System.out.println("体力：" + this.energy);
    }
}

public class VirtualPetGame {
    public static void main(String[] args) {
        // タロの実体を作っていきます
        VirtualDog taro = new VirtualDog("タロ", 100, 50);

        // ジロ
        VirtualDog jiro = new VirtualDog("ジロ", 80, 40);

        // 歩いたり寝たりさせてみる
        taro.walk();
        taro.walk();
        taro.sleep();
        jiro.sleep();
        jiro.walk();

        // タロ(taro)の情報を出力
        taro.printInfo();

        // ジロ(jiro)の情報を出力
        jiro.printInfo();
    }
}
