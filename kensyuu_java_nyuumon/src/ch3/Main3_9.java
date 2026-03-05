package ch3;
//for文のループを２重にして九九の表を出力する
public class Main3_9 {

	public static void main(String[] args) {
     for(int i = 1; i < 10; j++) {
      for(int j = 1; i < 10; j++)  {
       System.out.print(i * j++);
       System.out.print(" ");
      }
      System.out.println("");
     }
   }
 }
