package ch10;

import ch8.Matango;

//親クラスのattack()を呼び出す
public class SuperHero extends Hero {
  public void sttack(Matango m) {
	super.attack(m);
	if(this.flying) {
	super.attack(m);
	}
	}

}