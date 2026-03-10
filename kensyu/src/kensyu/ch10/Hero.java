package kensyu.ch10;

public class Hero {
	    String name;   // 名前
	    int hp;        // 体力

	    // 攻撃
	    public void attack(Matango m) {
	        System.out.println(this.name + "の攻撃！");
	        m.hp -= 5;
	        System.out.println("5ポイントのダメージをあたえた！");
	    }

	    // 逃げる
	    public void run() {
	        System.out.println(this.name + "は逃げ出した！");
	    }
	}

