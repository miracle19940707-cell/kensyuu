package ch10;

import ch8.Matango;

//「戦う」と「逃げる」しか出来ないHeroクラス
public class Main10_1 {
  String name="ミナト";
  int hp=100;
  //戦う
  public void attack(Matango m) {
    System.out.println(this.name+"攻撃！");
    m.hp -=5;
    System.out.println("5ポイントのダメージをあたえた！");
  }
  //逃げる
  public void run() {
	System.out.println(this.name+"は逃げ出した！");
		// TODO 自動生成されたメソッド・スタブ

	}

}
