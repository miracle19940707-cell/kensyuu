package kensyu.ch11;

public abstract class TangibleAssert {
  //フィールド
 String name;
  int price;
  String color;
  //コンストラクタ
  public TangibleAssert(String name,int price,String color) {
  this.name = name;
  this.price = price;
  this.color = color;
  }
  public String getName() {return this.name;}
  public int getPrice(){return this.price;}
  public String getColor() {return this.color;}
  }
 