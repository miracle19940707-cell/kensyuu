package kensyu.ch11;
import kensyu.ch10.Matango;
//未来の開発者が作成するクラス
public class Hero extends Character {
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃!");
    System.out.println("敵に10ポイントのダメージをあたえた！");
      m.hp -= 10;
    }
}
