package ch5;
//戻り値とは呼び出されたメソッドから呼び出し元のメソッドへ値を返すこと。戻される値は戻り値。
public class ch5_7 {
//コード５−３が基礎
	  public static int sdd(int x,int y) {
	   int ans = x + y;
	   return ans;
	  }
    public static void main(String[] args) {
       int ans = add(100,10);//addメソッドの呼び出し(110に化ける
       System.out.println("100 + 10 = "+ ans);
       
    }
	}

}
