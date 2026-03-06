package ch5;
//mainメソッドからメソッドを呼び出す
public class Main5_3 {

	public static void main(String[] args) {
      System.out.println("method");
      methodB();
	}
	public static void methodB() {
	  System.out.println("medhodB");
	}
	public static void main(String[] args) {
	 methodA();
 }
}
