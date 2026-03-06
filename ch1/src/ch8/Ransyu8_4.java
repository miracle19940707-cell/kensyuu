package ch8;

import java.util.Random;

public class Cleric {
	  String name;
	  int hp=50;
	  final int Max_HP =50;
	  int mp=10;
	  final int Max_MP =10;
	  
	  public void selfAid() {
		System.out.println(this.name+"はセルフエイドを唱えた！");
		this.hp=this.Max_HP;
		this.mp-=5;
		System.out.println("HPが最大まで回復した！");
	  }
	  public int pray(int sec) {
		System.out.println(this.name + sec +"秒間、天に祈った！");
		
		//論理上の回復量を乱数を率いて決定する
		int recover=new Random().nextint(3)+sec;
		
		//実際の回復量を計算する
		int recoverAcutual=Math.min(this.MAX_MP-this.mp,recover);
		
		this.mp += recoverActual;
		System.out.println("MPが"+recoverActual+"回復した");
		return recoverActual;
	  }
}