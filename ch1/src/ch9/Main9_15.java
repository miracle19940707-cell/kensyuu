package ch9;
//別のコンストラクタを呼び出す（エラー）
public class Main9_15 {
  public static void main(String[] args) {
  Strig name;
  int hp;
  
  public Hero(String name) {  //コンスクラクタ①
    this.hp=100;
    this.name=name;
  }
  public Hero() {  //コンストラクタ②
    this.Hero("ダミー");
  }

}
