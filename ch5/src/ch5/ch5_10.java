package ch5;
//オーバーロード
public class ch5_10 {
//1つめのメソッド
	public static int add(int x,int y) {
	 return x + y;
	}
//2つめのメソッド
	public static double add(double x,double y) {
	 return x + y;
//3つ目のメソッド
	public static String add(String x,String y) {
	 return x + y; 
	 }
	public static void main(String[] args) {
	 Sysyem.out.println(add(10,20));
	 System.out.println(add(3.5,2.5));
	 System.out.println(add("Hello","World"));
	}
	}
}
