package ch9;
//別のコントラクタを呼び出す
class Main9_16 {
  String name;
  int hp;
  
  public Hero(String name) {  //コンストラクタ①
    this.hp=100;
    this.name=name;
   }
  public Hero() {  //コンストラクタ②
	this("ダミー");
  }
}
