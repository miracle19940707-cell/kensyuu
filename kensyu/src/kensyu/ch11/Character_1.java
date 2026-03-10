package kensyu.ch11;
//Characterを抽象クラスとして宣言する
import kensyu.ch10.Matango;
public abstract class Character_1 {
  String name;
  int hp;
  public void run() {
    System.out.println(this.name + "は逃げ出した");
	}
  public abstract void attack(Matango m);
}
