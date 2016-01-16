/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author 笹田　裕介 <br />
 *         別クラスメソッドの呼出（ループ文による加算(引数間)） <br />
 *         ２つの実行時引数の間の整数の総和を求めるメソッドを呼び出して表示する <br />
 *         更新履歴 2015/12/13（更新者）：笹田　裕介：新規作成 <br />
 */
public class Test10 {

  /**
   * メインメソッド <br />
   * 引数間の値の総和を求めるメソッドを呼び出す <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    // a：実行時引数を整数型として格納する
    int a = Integer.parseInt( args[0] );
    // b：実行時引数を整数型として格納する
    int b = Integer.parseInt( args[1] );

    // addメソッドで計算した実行時引数間の整数の総和を表示する
    System.out.print( args[0] + " と " + args[1] + " の間の整数の総和は " + Test07.getSum( a, b ) + " です" );

  }

}
