package ch10;

import ch8.Matango;

//朝香さんが作成したSuperHeroクラス
public class Main10_2 {
  String name="ミナト";
  int hp=100;
  boolean flying;
  //戦う
  public void attack(Matango m) {
	System.out.println(this.name+"の攻撃！");
	m.hp =-5;
	System.out.println("5ポイントのダメージをあたえた！");
  }
  //逃げる
  public void run() {
	System.out.println(this.name+"は逃げ出した！");
  }
  //飛ぶ

}

