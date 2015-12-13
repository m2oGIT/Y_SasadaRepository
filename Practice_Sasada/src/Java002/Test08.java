/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author 笹田　裕介 <br />
 *         ループ文による加算(奇数限定) <br />
 *         任意の値の奇数のみの総和を表示する <br />
 *         更新履歴 2015/12/13（更新者）：笹田　裕介：新規作成 <br />
 */
public class Test08 {

  /**
   * メインメソッド <br />
   * 奇数の値を加算して結果を表示する <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    int sum = 0;

    // 1~100までの奇数の総和を求める
    for ( int i = 1; i <= 100; i++ ) {
      if ( i % 2 != 0 ) {
        sum = sum + i;
      }
    }

    // 1~100までの奇数の総和を表示する
    System.out.println( "1~100までの奇数の総和は " + sum + " です" );

  }

}
