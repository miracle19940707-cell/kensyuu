package ch5;
//mainメソッド以外からのメソッドの呼び出し
public class Ch5_3 {

	  public static void methodA() {
	  System.out.println("methodA");
	  methodB();//mainメソッドBの呼び出し
	}
     public static void methodB() {
     System.out.println("medhodB");
     }
     public static void main1(String[] args) {
     methodA();//mainメソッドAの呼び出し
     }
	}