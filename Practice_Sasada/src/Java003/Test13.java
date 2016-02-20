/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

/**
 * @author 笹田　裕介 <br />
 *         改行'*'表示 <br />
 *         行ごとに'*'を１つずつ増やしながら表示する <br />
 *         更新履歴 2016/2/20（更新者）：笹田　裕介：新規作成 <br />
 */
public class Test13 {

  /**
   * メインメソッド <br />
   * '*'を増やしながら改行表示 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    // 行ごとに*を１つずつ増やしながら表示する
    for ( int i = 1; i <= 10; i++ ) {
      for ( int j = 1; j <= i; j++ ) {
        System.out.print( '*' );
      }
      // 改行
      System.out.println();
    }
  }

}
