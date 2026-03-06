package ch10;
//コンストラクタの動作を確認する
public class Hero {

  public Hero() {
   System.out.println("Heroのコンストラクタが動作");
  }

}
  public class SuperHero extends Hero{
	  
   public SuperHero() {
   System.out.println("SuperHeroのコンストラクタが動作");
   }
   
  }
  public class Main{
    public static void main(String[]args) {
      SuperHero sh=new SuperHero();
    }
  }