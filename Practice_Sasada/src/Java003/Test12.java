/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 笹田　裕介 <br />
 *         実行日時の表示 <br />
 *         実行日時をyyyy/MM/dd HH:mm:ssの形式で表示する <br />
 *         更新履歴 2016/2/20（更新者）：笹田　裕介：新規作成 <br />
 */
public class Test12 {

  /**
   * メインメソッド <br />
   * 実行日時を取得して表示する <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 現在日時を取得
    Date date = new Date();

    SimpleDateFormat sdf = new SimpleDateFormat( "実行日時はyyyy/MM/dd HH:mm:ssです。" );
    String formatedDate = sdf.format( date );

    // 指定フォーマットで表示する。
    System.out.println( formatedDate );
  }

}
