package kensyu.ch12;
//Wizardクラスを通常の方法でインスタンス化
import kensyu.ch10.Matango;
public class ch12_3 {
	public static void main(String[] args) {
	  Wizard w = new Wizard();
	  Matango m = new Matango();
	  w.name = "アサカ";
	  w.attack(m);
	  w.fireball(m);
	}
}
