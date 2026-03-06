package ch9;
//回復魔法を使えるWizardクラス
public class Main9_5 {
  String name;
  int hp;
  public void heal(hero h) {
  h.hp += 10;
  System.out.println(h.name+"のHPを10回復した！");

	}

}
