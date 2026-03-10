package kensyu.ch11;

import kensyu.ch10.Matango;

//抽象メソッドを正しくオーバーライドする
public class Dancer extends Character{
   public void dance() {
	 System.out.println(this.name + "情熱的に踊った");
	}
   public void attack(Matango m) {
     System.out.println(this.name + "の攻撃");
     System.out.println("敵に３ポイントのダメージ");
    m.hp = -3;
   }
}