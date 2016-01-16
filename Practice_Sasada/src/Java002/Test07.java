/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author 笹田　裕介 <br />
 *         ループ文による加算 <br />
 *         メインメソッド：任意の値を加算して表示する <br />
 *         addメソッド ：渡された引数間の整数の総和を求める <br />
 *         更新履歴 2015/12/13（更新者）：笹田　裕介：新規作成 <br />
 */
public class Test07 {

  /**
   * メインメソッド <br />
   * 値を加算して結果を表示する <br />
   * 
   * @param args 実行時引数
   */

  public static void main( String[] args ) {
    int sum = 0;

    // 1~100までの総和を求める
    for ( int i = 1; i <= 100; i++ ) {
      sum = sum + i;
    }

    // 1~100までの総和を表示する
    System.out.println( "1~100まで総和は " + sum + " です" );

  }

  /**
   * sumの返却 <br />
   * sumの値を返却する。 <br />
   * 
   * @param a 引数1
   * @param b 引数2
   * @return sum2 渡された引数間の整数の総和
   */

  public static int getSum( int a, int b ) {
    int sum2 = 0;

    // 実行時引数の大小判定を行い、引数間の整数の総和を求める
    if ( a < b ) {
      for ( int i = a + 1; i < b; i++ ) {
        sum2 = sum2 + i;
      }
    } else if ( b < a ) {
      for ( int i = b + 1; i < a; i++ ) {
        sum2 = sum2 + i;
      }
    }

    // 引数間の整数の総和を返す
    return sum2;

  }
}
