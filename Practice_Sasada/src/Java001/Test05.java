/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java001;

/**
 * @author 笹田　裕介 <br />
 *         起動時引数の文字列表示 <br />
 *         引数で与えた任意の文字列を表示 <br />
 *         更新履歴 2015/12/06（更新者）：笹田　裕介：新規作成 <br />
 */
public class Test05 {

  /**
   * メインメソッド <br />
   * 起動時引数を表示 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    // args[0] = "私の戦闘力は"
    // args[1] = "53"
    // args[2] = "10000"
    // args[3] = "です"
    double a = Double.parseDouble( args[1] );
    double b = Double.parseDouble( args[2] );
    System.out.println( args[0] );
    System.out.print( a * b );
    System.out.println( args[3] );
  }

}
