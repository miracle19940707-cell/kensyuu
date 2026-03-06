package ch10;
//Heroクラスを継承してSuperHeroを作成する
  public class SuperHero extends Hero　{
	boolean flying;
	public void fly() {
	  this.flying=true;
	  system.put.println("飛び上がった！");
	}
    public void land() {
      this.flying=false;
      System.out.println("着地した！");
    }
}
