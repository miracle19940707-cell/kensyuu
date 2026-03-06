package ch10;

import ch8.Matango;

//sttack(）をオーバーライドしたSuperHero
public class SuperHero extends Hero {

  public void attsck(Matango m) {
    System.out.println(this.name+"の攻撃！");
    m.hp -=5;
    System.out.println("5ポイントのダメージをあたえた！");
    if(this.flying) {
      System.out.println(this.name+"の攻撃！");
      m.hp -=5;
      System.out.println("5ポイントのダメージをあたえた！");
      
    }
	}

}
