package ch10;
//slip()はオーバーライドできないHeroクラス
public class Hero {
   
  public final void slip() {
    this.hp -= 5;
    System.out.println(this.name+"は転んだ！");
    System.out.println("5のダメージ");
   }
   public viod run() {
	System.out.println(this.name + "は逃げ出した！");
	}
   
 }
