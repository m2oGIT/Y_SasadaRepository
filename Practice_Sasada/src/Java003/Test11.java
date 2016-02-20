/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author 笹田　裕介 <br />
 *         0.1を10回足して10倍した値の表示 <br />
 *         0.1を10回足したあと、10倍した値を表示する <br />
 *         更新履歴 2016/1/18（更新者）：笹田　裕介：新規作成 <br />
 */
public class Test11 {

  /**
   * メインメソッド <br />
   * 0.1を10回足したあと、10倍した値を表示する <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    BigDecimal bd1 = new BigDecimal( "0.1" );
    BigDecimal bd2 = new BigDecimal( "10" );
    BigDecimal sum = new BigDecimal( "0" );

    // 0.1を10回足す
    for ( int i = 1; i <= 10; i++ ) {
      sum = sum.add( bd1 );
    }
    // 1.0を10倍する
    BigDecimal sum2 = sum.multiply( bd2 );

    // 1.0 * 10 の結果を表示する
    System.out.println( sum2 );
  }

}
