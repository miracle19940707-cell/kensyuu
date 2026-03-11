package kensyu.ch11;
//インターフェースを継承したクラスの定義
public class KyotoCleaningShop implements CleaningServise{
  String ownerName;
  String address;
  String phone;
  /*シャツをあらう*/
  public Shirt washShirt(Shirt s) {
  //大型洗濯機十五分
  return s;  
  }
  //タオルを洗う
  public Towl washTowl(Towl t) {
   //大型洗濯機10分
  return t;
  }
  //コートを洗う
  public Coat washCort(Coat c) {
  //ドライ２０分
  return c;
}
}