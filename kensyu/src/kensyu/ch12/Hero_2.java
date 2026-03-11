package kensyu.ch12;

import kensyu.ch10.Matango;

//攻撃する相手ごとにattack()を作成
public class Hero_2 extends Character{
  public void attack(Matango m) {
  System.out.println(this.name + "の攻撃！");
  System.out.println("敵に１０ポイントのダメージをあたえた！");
  m.hp -=10;
  }
  public void attack(Goblin g) {
  System.out.println();
  System.out.println();
  g.hp -=10;
  }
  //以下スライム用など続く
}
