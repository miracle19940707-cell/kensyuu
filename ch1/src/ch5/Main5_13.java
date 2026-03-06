package ch5;
//同じ配列を参照している状態を確認する
public class Main5_13 {
//int型配列を受け取り、
//配列内の要素全てに１を加えるメソッド
  public static void incArray(int[] array) {
	for (int i = 0; i < array.length; i++) {
	  array[i]++;
	}
	for (int i = 0; i < array.length; i++) {
	  System.out.println(i);
	 }
	}
   }