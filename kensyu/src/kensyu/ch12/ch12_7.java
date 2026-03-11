package kensyu.ch12;
import kensyu.ch11.Hero;
//多能性と配列を組み合わせて宿舎に泊まる
public class ch12_7 {
	public static void main(String[] args) {
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		//宿舎に泊まる
		for(Character ch:c) {
		ch.hp =+50;
		}
	}
}
