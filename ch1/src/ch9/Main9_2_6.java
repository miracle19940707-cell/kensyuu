package ch9;
//勇者と魔法使いを生み出す（抜粋）
public class Main9_2_6 {
	public static void main(String[] args) {
    
	Hero h1=new Hero();
	h1.name="ミナト";
	h1.hp=100;
	Hero H2=new Hero();
	h2.name="アサカ";
	h2.hp=100;
	Wizard w = new Wizard();
	w.name="スガワラ";
	w.hp=50;
	w.heal(h1);
	w.heal(h2);
	w.heal(h2);
	

	}

}
