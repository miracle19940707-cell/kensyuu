package kensyu.ch12;
import kensyu.ch10.Matango;
//Charaterを継承して定着された
public class Wizard extends Character {
 String name;
 int mp;
 public void attack(Matango m) {
  System.out.println(this.name + "の攻撃！");
  System.out.println("敵に３ポイントのダメージ");
  m.hp -= 3;
 }
public void fireball(Matango m) {
   System.out.println(this.name + "は火の玉を放った！");
   System .out .println (this.name + "に２０ポイントのダメージ！");
   m.hp -= 20;
   this.mp -= 5;
  }
}