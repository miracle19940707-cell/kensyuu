package kensyu.ch10;
public class Matango {
   public int hp = 50;   // 体力
   char suffix;   // AやBなどの名前

	    // 攻撃メソッド
	    public void attack(Hero h) {
	        System.out.println("キノコ" + this.suffix + "の攻撃！");
	        System.out.println("10のダメージ！");
	        h.hp -= 10;
	    }
	}