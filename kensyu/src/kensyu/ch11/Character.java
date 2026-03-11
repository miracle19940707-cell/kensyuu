package kensyu.ch11;

import kensyu.ch10.Matango;

//Characterクラスを作成（未完成）
public class Character {
	String name;
	public int hp;
	//逃げる
	public void run() {
	  System.out.println(this.name+"は逃げ出した");
	}
    //戦う
	public void attack(Matango m) {
	  m.hp -=10;
	  System.out.println("敵に10ポイントのダメージを与えた");
	}
}
