/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 笹田　裕介 <br />
 *         コンソール入力値から最大値を表示 <br />
 *         整数を５回入力して、最大値を表示する <br />
 *         更新履歴 2016/2/20（更新者）：笹田　裕介：新規作成 <br />
 */
public class ArrayTest {

  /**
   * メインメソッド <br />
   * コンソールに値を５回入力し、最大値を表示する <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    int i = 0;
    // 最大値を格納
    int b = 0;
    // 合計値を格納
    int c = 0;
    // 平均値を格納
    double d = 0;
    System.out.print( "整数を５回入力してください。>" );

    // 入力ストリームのインスタンスを仮で生成。
    BufferedReader input = null;

    try {
      while ( true ) {
        // コンソールに入力する
        input = new BufferedReader( new InputStreamReader( System.in ) );

        // 入力した文字列を値に変換
        String str = input.readLine();
        int a = Integer.parseInt( str );

        // 入力値の大小比較
        c = c + a;
        if ( a > b ) {
          b = a;
        }

        // ５回入力するまで繰り返す
        i++;

        // ５回入力したら終了
        if ( i == 5 ) {
          break;
        }
      }
      System.out.println( "最大値は" + b );
      System.out.println( "合計値は" + c );

      d = c;
      // 合計値を入力回数の５で割り、平均値を表示する
      System.out.println( "平均値は" + d / 5 );

    } catch ( IOException e ) {

      // 入出力エラー時の処理
      System.out.println( "入出力エラーです。" );

    } catch ( NumberFormatException e ) {

      // 整数値以外の入力時の処理
      System.out.println( "整数ではありません。処理を終了します。" );

    } finally {

      // Streamは使用後にクローズする。
      try {
        input.close();
      } catch ( IOException e ) {
        e.printStackTrace();
      }
    }

  }
}
