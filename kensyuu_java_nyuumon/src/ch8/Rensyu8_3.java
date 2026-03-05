package ch8;

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
     }
