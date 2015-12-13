/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author 笹田　裕介 <br />
 *         ループ文による加算(引数) <br />
 *         任意の値から実行時引数までの総和を表示する <br />
 *         更新履歴 2015/12/13（更新者）：笹田　裕介：新規作成 <br />
 */
public class Test09 {

  /**
   * メインメソッド <br />
   * 実行時引数までの総和を表示する <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    int sum = 0;
    // a：実行時引数を整数型として格納する
    int a = Integer.parseInt( args[0] );

    // 1~実行時引数までの総和を求める
    for ( int i = 1; i <= a; i++ ) {
      sum = sum + i;
    }

    // 1~実行時引数までの総和を表示する
    System.out.println( "1~" + args[0] + "までの総和は " + sum + " です" );

  }

}
